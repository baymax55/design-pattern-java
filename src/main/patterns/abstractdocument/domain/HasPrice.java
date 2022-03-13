package main.patterns.abstractdocument.domain;

import main.patterns.abstractdocument.Document;
import main.patterns.abstractdocument.domain.enums.Property;

import java.util.Optional;

public interface HasPrice extends Document {
    default Optional<Number> getPrice() {
        return Optional.ofNullable((Number) get(Property.PRICE.toString()));
    }
}
