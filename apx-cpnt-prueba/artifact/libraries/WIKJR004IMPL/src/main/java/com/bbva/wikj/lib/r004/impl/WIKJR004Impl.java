package com.bbva.wikj.lib.r004.impl;

import com.bbva.apx.exception.db.NoResultException;
import com.bbva.wikj.dto.user.DtoIn;
import com.bbva.wikj.dto.user.DtoOut;
import java.util.HashMap;
import java.util.Map;

public class WIKJR004Impl extends WIKJR004Abstract {

	@Override
	public DtoOut execute(DtoIn dtoIn) {
		DtoOut dtoOut = new DtoOut();
		Map<String, Object> args = new HashMap<>();

		args.put("id", dtoIn.getId());
		args.put("nuip", dtoIn.getNuip());
		args.put("full_name", dtoIn.getFull_name());
		args.put("phone", dtoIn.getPhone());
		args.put("address", dtoIn.getAddress());

		Map<String, Object> response = null;

		try {
			// Primero, intentamos obtener el registro con el nuip
			response = this.wikjR005.executeSelect(dtoIn.getNuip());

			if (response != null && !response.isEmpty()) {
				// Si encontramos el nuip, no insertamos, solo mapeamos
			} else {
				// Si no existe el nuip, procedemos a la inserción
				int result = this.wikjR005.executeInsert(args);
				// Luego de la inserción, volvemos a hacer el SELECT para obtener el registro recién insertado
				response = this.wikjR005.executeSelect(dtoIn.getNuip());
			}
		} catch (NoResultException e) {
			// Si no encontramos un registro y hubo una excepción de no resultado, realizamos la inserción
			int result = this.wikjR005.executeInsert(args);
			// Luego de la inserción, volvemos a hacer el SELECT
			response = this.wikjR005.executeSelect(dtoIn.getNuip());
		} catch (Exception e) {
			response = new HashMap<>(); // Evitar NullPointerException
		} finally {
			if (response == null) {
				response = new HashMap<>(); // Asegurar que nunca sea null
			}
			map(dtoOut, response);
		}

		return dtoOut;
	}
		 private void map(DtoOut dtoOut, Map<String, Object> response){
			dtoOut.setId(response.get("id").toString());
			dtoOut.setNuip(response.get("nuip").toString());
			dtoOut.setFull_name(response.get("full_name").toString());
			dtoOut.setPhone(response.get("phone").toString());
			dtoOut.setAddress(response.get("address").toString());

	    }
	}