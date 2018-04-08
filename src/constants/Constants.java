package constants;

import java.util.HashMap;

public class Constants {

    public final static byte GRASS = 0x00;
    public final static byte ROAD = 0x01;
    public final static byte ROAD_LEFT = 0x02;
    public final static byte ROAD_CENTER = 0x03;
    public final static byte ROAD_RIGHT = 0x04;

    public final static byte CORE_CONSTANTS = 0x00;
    public final static byte UI_CONSTANTS = 0x01;

    private final static String ui_definition_path = "UIDefinitions.constants";
    private final static String core_definition_path = "CoreDefinitions.constants";

    private static HashMap<String, Integer> integer_parameters = new HashMap<>();

    public static int getInt(String resource_name, byte type) {
        try {
            return integer_parameters.get(resource_name);
        } catch (NullPointerException e) {
            switch (type) {
                case CORE_CONSTANTS:
                    integer_parameters.put(resource_name,
                            ParseUtils.parseInt(core_definition_path, resource_name));
                    break;
                case UI_CONSTANTS:
                    integer_parameters.put(resource_name,
                            ParseUtils.parseInt(ui_definition_path, resource_name));
                    break;
                default:
                    return 0;
            }
            return getInt(resource_name, type);
        }
    }

}
