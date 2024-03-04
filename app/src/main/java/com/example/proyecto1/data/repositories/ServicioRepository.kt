package com.example.proyecto1.data.repositories

import com.example.proyecto1.data.dao.ServicioDao
import com.example.proyecto1.data.model.Servicio
import kotlinx.coroutines.flow.Flow

class ServicioRepository (
    val servicioDao: ServicioDao
) {
    fun getAllServicios(): Flow<List<Servicio>> {
        return servicioDao.getAllServicios()
    }

    suspend fun insertServicio(servicio: Servicio) {
        servicioDao.insertServicio(servicio)
    }

    suspend fun deleteServicio(servicio: Servicio) {
        servicioDao.deleteServicio(servicio)
    }
}