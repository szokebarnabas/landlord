package com.landlord.domain.property;

import landlord.ddd.pattern.model.ID;

public class PropertyId extends ID {

    public PropertyId(String value) {
        super(value);
    }

    public static PropertyId createFrom(String id) {
        return new PropertyId(id);
    }
}
