package main.patterns.abstractdocument.domain;

import main.patterns.abstractdocument.Document;
import main.patterns.abstractdocument.domain.enums.Property;

import java.util.Optional;

public interface HasModel extends Document {
    default Optional<String> getModel() {
        return Optional.ofNullable((String) get(Property.MODEL.toString()));
    }
}
