package main.patterns.abstractdocument.domain;

import main.patterns.abstractdocument.Document;
import main.patterns.abstractdocument.domain.enums.Property;

import java.util.Optional;

public interface HasType extends Document {
    default Optional<String> getType() {
        return Optional.ofNullable((String) get(Property.TYPE.toString()));
    }
}
