package com.kakka.core

import kotlinx.coroutines.flow.Flow

interface Storage {
    suspend fun saveEvent(key: EntityKey, sequence: Sequence, payload: Payload)
    suspend fun saveSnapshot(key: EntityKey, sequence: Sequence, payload: Payload)
    suspend fun findEvents(key: EntityKey, fromSequence: Sequence, toSequence: Sequence): Flow<ByteArray>
    suspend fun findSnapshots(key: EntityKey, fromSequence: Sequence, toSequence: Sequence): Flow<ByteArray>
}