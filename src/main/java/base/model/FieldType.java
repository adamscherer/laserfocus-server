package base.model;

/**
 * @author Adam Scherer
 * @since 1.0
 */
public enum FieldType {

    SINGLE_LINE_TEXT("Single-line Text"),

    MULTI_LINE_TEXT("Multi-ine Text"),

    NUMBER("Multi-ine Text"),

    RADIO_SELECT("Radio Select"),

    DROPDOWN_SELECT("Dropdown Select"),

    SINGLE_CHECKBOX("Single Checkbox"),

    MULTI_CHECKBOX("Multiple Checkbox");

    private final String name;


    FieldType(String name) {
        this.name = name;
    }
}
