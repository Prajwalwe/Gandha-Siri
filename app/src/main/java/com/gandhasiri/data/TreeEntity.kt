package com.gandhasiri.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "sandalwood_register")
data class TreeEntity(
    @PrimaryKey 
    val treeId: String = "SIRI-${UUID.randomUUID().toString().take(6).uppercase()}",
    val latitude: Double,
    val longitude: Double,
    val girth: Double,
    val imageUrl: String,
    val timestamp: Long = System.currentTimeMillis()
)

