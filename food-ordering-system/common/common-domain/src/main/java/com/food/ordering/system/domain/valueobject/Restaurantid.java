package com.food.ordering.system.domain.valueobject;

import java.util.UUID;

public class Restaurantid extends BaseId<UUID> {
    protected Restaurantid(UUID value) {
        super(value);
    }
}
