package com.example.todo.model

import jakarta.persistence.*
import java.time.ZonedDateTime
import java.util.*

@Entity
@Table(name = "todo")
class Todo (
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false, updatable = false)
    var id: UUID = UUID.randomUUID(),

    @Column(name = "created", nullable = false, updatable = false)
    var created: ZonedDateTime = ZonedDateTime.now(),

    @Column(name = "last_updated", nullable = false)
    var lastUpdated: ZonedDateTime = ZonedDateTime.now(),

    @Column(name = "title", nullable = false)
    var title: String = "",

    @Column(name = "description", nullable = false)
    var description: String = "",

    @Column(name = "status", nullable = false)
    var status: String = ""
)