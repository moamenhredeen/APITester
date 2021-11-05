package com.moamen.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@DatabaseTable(tableName = "request")
public class Request {

    @DatabaseField(id = true, generatedId = true, useGetSet = true)
    private int id;

    @DatabaseField(canBeNull = false, useGetSet = true)
    private String url;

    @DatabaseField(canBeNull = false, useGetSet = true)
    private String httpVerb;

    @DatabaseField(foreign = true, useGetSet = true)
    private int projectId;
}

