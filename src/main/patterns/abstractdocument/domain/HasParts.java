package main.patterns.abstractdocument.domain;


import main.patterns.abstractdocument.Document;
import main.patterns.abstractdocument.domain.enums.Property;

import java.util.stream.Stream;

public interface HasParts extends Document {
    default Stream<Part> getParts() {
        return children(Property.PARTS.toString(), Part::new);
    }
}
