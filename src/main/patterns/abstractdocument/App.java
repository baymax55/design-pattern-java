package main.patterns.abstractdocument;

import lombok.extern.slf4j.Slf4j;
import main.patterns.abstractdocument.domain.Car;
import main.patterns.abstractdocument.domain.enums.Property;

import java.util.List;
import java.util.Map;


@Slf4j
public class App {
    public static void main(String[] args) {
        log.info("Constructing parts and car");

        var wheelProperties = Map.of(
                Property.TYPE.toString(), "wheel",
                Property.MODEL.toString(), "15C",
                Property.PRICE.toString(), 100L);

        var doorProperties = Map.of(
                Property.TYPE.toString(), "door",
                Property.MODEL.toString(), "Lambo",
                Property.PRICE.toString(), 300L);

        var carProperties = Map.of(
                Property.MODEL.toString(), "300SL",
                Property.PRICE.toString(), 10000L,
                Property.PARTS.toString(), List.of(wheelProperties, doorProperties));

        var car = new Car(carProperties);

        log.info("Here is our car:");
        log.info("-> model: {}", car.getModel().orElseThrow());
        log.info("-> price: {}", car.getPrice().orElseThrow());
        log.info("-> parts: ");
        car.getParts().forEach(p -> log.info("\t{}/{}/{}",
                p.getType().orElse(null),
                p.getModel().orElse(null),
                p.getPrice().orElse(null))
        );
    }
}
