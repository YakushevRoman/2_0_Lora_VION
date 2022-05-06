package generation.files;

    public final class ForpostServer {
        private ForpostServer() {}
        public static void registerAllExtensions(
                com.google.protobuf.ExtensionRegistryLite registry) {
        }

        public static void registerAllExtensions(
                com.google.protobuf.ExtensionRegistry registry) {
            registerAllExtensions(
                    (com.google.protobuf.ExtensionRegistryLite) registry);
        }
        /**
         * Protobuf enum {@code ErrorType}
         */
        public enum ErrorType
                implements com.google.protobuf.ProtocolMessageEnum {
            /**
             * <code>e_UNKNOWN = 0;</code>
             */
            e_UNKNOWN(0),
            /**
             * <code>e_IR_strength = 1;</code>
             */
            e_IR_strength(1),
            /**
             * <code>e_volume_level = 2;</code>
             */
            e_volume_level(2),
            /**
             * <code>e_next_id = 3;</code>
             */
            e_next_id(3),
            /**
             * <code>e_command = 4;</code>
             */
            e_command(4),
            /**
             * <code>e_activation_time = 5;</code>
             */
            e_activation_time(5),
            /**
             * <code>e_inactivity_time = 6;</code>
             */
            e_inactivity_time(6),
            /**
             * <code>e_rad_health_take = 7;</code>
             */
            e_rad_health_take(7),
            /**
             * <code>e_med_health_add = 8;</code>
             */
            e_med_health_add(8),
            /**
             * <code>e_cp_health = 9;</code>
             */
            e_cp_health(9),
            /**
             * <code>e_brightnes = 10;</code>
             */
            e_brightnes(10),
            /**
             * <code>e_mode = 11;</code>
             */
            e_mode(11),
            UNRECOGNIZED(-1),
            ;

            /**
             * <code>e_UNKNOWN = 0;</code>
             */
            public static final int e_UNKNOWN_VALUE = 0;
            /**
             * <code>e_IR_strength = 1;</code>
             */
            public static final int e_IR_strength_VALUE = 1;
            /**
             * <code>e_volume_level = 2;</code>
             */
            public static final int e_volume_level_VALUE = 2;
            /**
             * <code>e_next_id = 3;</code>
             */
            public static final int e_next_id_VALUE = 3;
            /**
             * <code>e_command = 4;</code>
             */
            public static final int e_command_VALUE = 4;
            /**
             * <code>e_activation_time = 5;</code>
             */
            public static final int e_activation_time_VALUE = 5;
            /**
             * <code>e_inactivity_time = 6;</code>
             */
            public static final int e_inactivity_time_VALUE = 6;
            /**
             * <code>e_rad_health_take = 7;</code>
             */
            public static final int e_rad_health_take_VALUE = 7;
            /**
             * <code>e_med_health_add = 8;</code>
             */
            public static final int e_med_health_add_VALUE = 8;
            /**
             * <code>e_cp_health = 9;</code>
             */
            public static final int e_cp_health_VALUE = 9;
            /**
             * <code>e_brightnes = 10;</code>
             */
            public static final int e_brightnes_VALUE = 10;
            /**
             * <code>e_mode = 11;</code>
             */
            public static final int e_mode_VALUE = 11;


            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException(
                            "Can't get the number of an unknown enum value.");
                }
                return value;
            }

            /**
             * @param value The numeric wire value of the corresponding enum entry.
             * @return The enum associated with the given numeric wire value.
             * @deprecated Use {@link #forNumber(int)} instead.
             */
            @Deprecated
            public static ErrorType valueOf(int value) {
                return forNumber(value);
            }

            /**
             * @param value The numeric wire value of the corresponding enum entry.
             * @return The enum associated with the given numeric wire value.
             */
            public static ErrorType forNumber(int value) {
                switch (value) {
                    case 0: return e_UNKNOWN;
                    case 1: return e_IR_strength;
                    case 2: return e_volume_level;
                    case 3: return e_next_id;
                    case 4: return e_command;
                    case 5: return e_activation_time;
                    case 6: return e_inactivity_time;
                    case 7: return e_rad_health_take;
                    case 8: return e_med_health_add;
                    case 9: return e_cp_health;
                    case 10: return e_brightnes;
                    case 11: return e_mode;
                    default: return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<ErrorType>
            internalGetValueMap() {
                return internalValueMap;
            }
            private static final com.google.protobuf.Internal.EnumLiteMap<
                    ErrorType> internalValueMap =
                    new com.google.protobuf.Internal.EnumLiteMap<ErrorType>() {
                        public ErrorType findValueByNumber(int number) {
                            return ErrorType.forNumber(number);
                        }
                    };

            public final com.google.protobuf.Descriptors.EnumValueDescriptor
            getValueDescriptor() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalStateException(
                            "Can't get the descriptor of an unrecognized enum value.");
                }
                return getDescriptor().getValues().get(ordinal());
            }
            public final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptorForType() {
                return getDescriptor();
            }
            public static final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptor() {
                return ForpostServer.getDescriptor().getEnumTypes().get(0);
            }

            private static final ErrorType[] VALUES = values();

            public static ErrorType valueOf(
                    com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException(
                            "EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[desc.getIndex()];
            }

            private final int value;

            private ErrorType(int value) {
                this.value = value;
            }

            // @@protoc_insertion_point(enum_scope:ErrorType)
        }

        /**
         * Protobuf enum {@code DevType}
         */
        public enum DevType
                implements com.google.protobuf.ProtocolMessageEnum {
            /**
             * <code>UNKNOWN = 0;</code>
             */
            UNKNOWN(0),
            /**
             * <code>TAGER_NETRONIC = 1;</code>
             */
            TAGER_NETRONIC(1),
            /**
             * <code>KTS = 2;</code>
             */
            KTS(2),
            /**
             * <code>MS = 3;</code>
             */
            MS(3),
            /**
             * <code>miniMS = 4;</code>
             */
            miniMS(4),
            /**
             * <code>MillitaryKit = 5;</code>
             */
            MillitaryKit(5),
            /**
             * <code>MillitaryDome = 6;</code>
             */
            MillitaryDome(6),
            /**
             * <code>MP_4 = 7;</code>
             */
            MP_4(7),
            /**
             * <code>GLOCK = 8;</code>
             */
            GLOCK(8),
            /**
             * <code>PKM = 9;</code>
             */
            PKM(9),
            /**
             * <code>TAGER_ECLIPSE = 10;</code>
             */
            TAGER_ECLIPSE(10),
            /**
             * <code>TAGER_PULSE = 11;</code>
             */
            TAGER_PULSE(11),
            /**
             * <code>TAGER_VR = 12;</code>
             */
            TAGER_VR(12),
            /**
             * <code>BOMB_PRO = 13;</code>
             */
            BOMB_PRO(13),
            /**
             * <code>TAGER_F05 = 14;</code>
             */
            TAGER_F05(14),
            UNRECOGNIZED(-1),
            ;

            /**
             * <code>UNKNOWN = 0;</code>
             */
            public static final int UNKNOWN_VALUE = 0;
            /**
             * <code>TAGER_NETRONIC = 1;</code>
             */
            public static final int TAGER_NETRONIC_VALUE = 1;
            /**
             * <code>KTS = 2;</code>
             */
            public static final int KTS_VALUE = 2;
            /**
             * <code>MS = 3;</code>
             */
            public static final int MS_VALUE = 3;
            /**
             * <code>miniMS = 4;</code>
             */
            public static final int miniMS_VALUE = 4;
            /**
             * <code>MillitaryKit = 5;</code>
             */
            public static final int MillitaryKit_VALUE = 5;
            /**
             * <code>MillitaryDome = 6;</code>
             */
            public static final int MillitaryDome_VALUE = 6;
            /**
             * <code>MP_4 = 7;</code>
             */
            public static final int MP_4_VALUE = 7;
            /**
             * <code>GLOCK = 8;</code>
             */
            public static final int GLOCK_VALUE = 8;
            /**
             * <code>PKM = 9;</code>
             */
            public static final int PKM_VALUE = 9;
            /**
             * <code>TAGER_ECLIPSE = 10;</code>
             */
            public static final int TAGER_ECLIPSE_VALUE = 10;
            /**
             * <code>TAGER_PULSE = 11;</code>
             */
            public static final int TAGER_PULSE_VALUE = 11;
            /**
             * <code>TAGER_VR = 12;</code>
             */
            public static final int TAGER_VR_VALUE = 12;
            /**
             * <code>BOMB_PRO = 13;</code>
             */
            public static final int BOMB_PRO_VALUE = 13;
            /**
             * <code>TAGER_F05 = 14;</code>
             */
            public static final int TAGER_F05_VALUE = 14;


            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException(
                            "Can't get the number of an unknown enum value.");
                }
                return value;
            }

            /**
             * @param value The numeric wire value of the corresponding enum entry.
             * @return The enum associated with the given numeric wire value.
             * @deprecated Use {@link #forNumber(int)} instead.
             */
            @Deprecated
            public static DevType valueOf(int value) {
                return forNumber(value);
            }

            /**
             * @param value The numeric wire value of the corresponding enum entry.
             * @return The enum associated with the given numeric wire value.
             */
            public static DevType forNumber(int value) {
                switch (value) {
                    case 0: return UNKNOWN;
                    case 1: return TAGER_NETRONIC;
                    case 2: return KTS;
                    case 3: return MS;
                    case 4: return miniMS;
                    case 5: return MillitaryKit;
                    case 6: return MillitaryDome;
                    case 7: return MP_4;
                    case 8: return GLOCK;
                    case 9: return PKM;
                    case 10: return TAGER_ECLIPSE;
                    case 11: return TAGER_PULSE;
                    case 12: return TAGER_VR;
                    case 13: return BOMB_PRO;
                    case 14: return TAGER_F05;
                    default: return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<DevType>
            internalGetValueMap() {
                return internalValueMap;
            }
            private static final com.google.protobuf.Internal.EnumLiteMap<
                    DevType> internalValueMap =
                    new com.google.protobuf.Internal.EnumLiteMap<DevType>() {
                        public DevType findValueByNumber(int number) {
                            return DevType.forNumber(number);
                        }
                    };

            public final com.google.protobuf.Descriptors.EnumValueDescriptor
            getValueDescriptor() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalStateException(
                            "Can't get the descriptor of an unrecognized enum value.");
                }
                return getDescriptor().getValues().get(ordinal());
            }
            public final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptorForType() {
                return getDescriptor();
            }
            public static final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptor() {
                return ForpostServer.getDescriptor().getEnumTypes().get(1);
            }

            private static final DevType[] VALUES = values();

            public static DevType valueOf(
                    com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException(
                            "EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[desc.getIndex()];
            }

            private final int value;

            private DevType(int value) {
                this.value = value;
            }

            // @@protoc_insertion_point(enum_scope:DevType)
        }

        /**
         * Protobuf enum {@code LangugeType}
         */
        public enum LangugeType
                implements com.google.protobuf.ProtocolMessageEnum {
            /**
             * <code>LANG_UNKNOWN = 0;</code>
             */
            LANG_UNKNOWN(0),
            /**
             * <code>RUSSIAN = 1;</code>
             */
            RUSSIAN(1),
            /**
             * <code>ENGLISH = 2;</code>
             */
            ENGLISH(2),
            /**
             * <code>SPANISH = 3;</code>
             */
            SPANISH(3),
            /**
             * <code>FRENCH = 4;</code>
             */
            FRENCH(4),
            /**
             * <code>GERMAN = 5;</code>
             */
            GERMAN(5),
            /**
             * <code>ITALIAN = 6;</code>
             */
            ITALIAN(6),
            /**
             * <code>UKRAINIAN = 7;</code>
             */
            UKRAINIAN(7),
            /**
             * <code>maxLangNum = 8;</code>
             */
            maxLangNum(8),
            UNRECOGNIZED(-1),
            ;

            /**
             * <code>LANG_UNKNOWN = 0;</code>
             */
            public static final int LANG_UNKNOWN_VALUE = 0;
            /**
             * <code>RUSSIAN = 1;</code>
             */
            public static final int RUSSIAN_VALUE = 1;
            /**
             * <code>ENGLISH = 2;</code>
             */
            public static final int ENGLISH_VALUE = 2;
            /**
             * <code>SPANISH = 3;</code>
             */
            public static final int SPANISH_VALUE = 3;
            /**
             * <code>FRENCH = 4;</code>
             */
            public static final int FRENCH_VALUE = 4;
            /**
             * <code>GERMAN = 5;</code>
             */
            public static final int GERMAN_VALUE = 5;
            /**
             * <code>ITALIAN = 6;</code>
             */
            public static final int ITALIAN_VALUE = 6;
            /**
             * <code>UKRAINIAN = 7;</code>
             */
            public static final int UKRAINIAN_VALUE = 7;
            /**
             * <code>maxLangNum = 8;</code>
             */
            public static final int maxLangNum_VALUE = 8;


            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException(
                            "Can't get the number of an unknown enum value.");
                }
                return value;
            }

            /**
             * @param value The numeric wire value of the corresponding enum entry.
             * @return The enum associated with the given numeric wire value.
             * @deprecated Use {@link #forNumber(int)} instead.
             */
            @Deprecated
            public static LangugeType valueOf(int value) {
                return forNumber(value);
            }

            /**
             * @param value The numeric wire value of the corresponding enum entry.
             * @return The enum associated with the given numeric wire value.
             */
            public static LangugeType forNumber(int value) {
                switch (value) {
                    case 0: return LANG_UNKNOWN;
                    case 1: return RUSSIAN;
                    case 2: return ENGLISH;
                    case 3: return SPANISH;
                    case 4: return FRENCH;
                    case 5: return GERMAN;
                    case 6: return ITALIAN;
                    case 7: return UKRAINIAN;
                    case 8: return maxLangNum;
                    default: return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<LangugeType>
            internalGetValueMap() {
                return internalValueMap;
            }
            private static final com.google.protobuf.Internal.EnumLiteMap<
                    LangugeType> internalValueMap =
                    new com.google.protobuf.Internal.EnumLiteMap<LangugeType>() {
                        public LangugeType findValueByNumber(int number) {
                            return LangugeType.forNumber(number);
                        }
                    };

            public final com.google.protobuf.Descriptors.EnumValueDescriptor
            getValueDescriptor() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalStateException(
                            "Can't get the descriptor of an unrecognized enum value.");
                }
                return getDescriptor().getValues().get(ordinal());
            }
            public final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptorForType() {
                return getDescriptor();
            }
            public static final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptor() {
                return ForpostServer.getDescriptor().getEnumTypes().get(2);
            }

            private static final LangugeType[] VALUES = values();

            public static LangugeType valueOf(
                    com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException(
                            "EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[desc.getIndex()];
            }

            private final int value;

            private LangugeType(int value) {
                this.value = value;
            }

            // @@protoc_insertion_point(enum_scope:LangugeType)
        }

        /**
         * Protobuf enum {@code SlaveState}
         */
        public enum SlaveState
                implements com.google.protobuf.ProtocolMessageEnum {
            /**
             * <code>DELETED = 0;</code>
             */
            DELETED(0),
            /**
             * <code>ADDED = 1;</code>
             */
            ADDED(1),
            UNRECOGNIZED(-1),
            ;

            /**
             * <code>DELETED = 0;</code>
             */
            public static final int DELETED_VALUE = 0;
            /**
             * <code>ADDED = 1;</code>
             */
            public static final int ADDED_VALUE = 1;


            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException(
                            "Can't get the number of an unknown enum value.");
                }
                return value;
            }

            /**
             * @param value The numeric wire value of the corresponding enum entry.
             * @return The enum associated with the given numeric wire value.
             * @deprecated Use {@link #forNumber(int)} instead.
             */
            @Deprecated
            public static SlaveState valueOf(int value) {
                return forNumber(value);
            }

            /**
             * @param value The numeric wire value of the corresponding enum entry.
             * @return The enum associated with the given numeric wire value.
             */
            public static SlaveState forNumber(int value) {
                switch (value) {
                    case 0: return DELETED;
                    case 1: return ADDED;
                    default: return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<SlaveState>
            internalGetValueMap() {
                return internalValueMap;
            }
            private static final com.google.protobuf.Internal.EnumLiteMap<
                    SlaveState> internalValueMap =
                    new com.google.protobuf.Internal.EnumLiteMap<SlaveState>() {
                        public SlaveState findValueByNumber(int number) {
                            return SlaveState.forNumber(number);
                        }
                    };

            public final com.google.protobuf.Descriptors.EnumValueDescriptor
            getValueDescriptor() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalStateException(
                            "Can't get the descriptor of an unrecognized enum value.");
                }
                return getDescriptor().getValues().get(ordinal());
            }
            public final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptorForType() {
                return getDescriptor();
            }
            public static final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptor() {
                return ForpostServer.getDescriptor().getEnumTypes().get(3);
            }

            private static final SlaveState[] VALUES = values();

            public static SlaveState valueOf(
                    com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException(
                            "EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[desc.getIndex()];
            }

            private final int value;

            private SlaveState(int value) {
                this.value = value;
            }

            // @@protoc_insertion_point(enum_scope:SlaveState)
        }

        /**
         * Protobuf enum {@code DisplayType}
         */
        public enum DisplayType
                implements com.google.protobuf.ProtocolMessageEnum {
            /**
             * <code>UNDEFINE = 0;</code>
             */
            UNDEFINE(0),
            /**
             * <code>OLED = 1;</code>
             */
            OLED(1),
            /**
             * <code>LCD = 2;</code>
             */
            LCD(2),
            /**
             * <code>TFT = 3;</code>
             */
            TFT(3),
            /**
             * <code>IPS = 4;</code>
             */
            IPS(4),
            /**
             * <code>NO_DISPLAY = 5;</code>
             */
            NO_DISPLAY(5),
            /**
             * <code>AUTODETECTION = 6;</code>
             */
            AUTODETECTION(6),
            UNRECOGNIZED(-1),
            ;

            /**
             * <code>UNDEFINE = 0;</code>
             */
            public static final int UNDEFINE_VALUE = 0;
            /**
             * <code>OLED = 1;</code>
             */
            public static final int OLED_VALUE = 1;
            /**
             * <code>LCD = 2;</code>
             */
            public static final int LCD_VALUE = 2;
            /**
             * <code>TFT = 3;</code>
             */
            public static final int TFT_VALUE = 3;
            /**
             * <code>IPS = 4;</code>
             */
            public static final int IPS_VALUE = 4;
            /**
             * <code>NO_DISPLAY = 5;</code>
             */
            public static final int NO_DISPLAY_VALUE = 5;
            /**
             * <code>AUTODETECTION = 6;</code>
             */
            public static final int AUTODETECTION_VALUE = 6;


            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException(
                            "Can't get the number of an unknown enum value.");
                }
                return value;
            }

            /**
             * @param value The numeric wire value of the corresponding enum entry.
             * @return The enum associated with the given numeric wire value.
             * @deprecated Use {@link #forNumber(int)} instead.
             */
            @Deprecated
            public static DisplayType valueOf(int value) {
                return forNumber(value);
            }

            /**
             * @param value The numeric wire value of the corresponding enum entry.
             * @return The enum associated with the given numeric wire value.
             */
            public static DisplayType forNumber(int value) {
                switch (value) {
                    case 0: return UNDEFINE;
                    case 1: return OLED;
                    case 2: return LCD;
                    case 3: return TFT;
                    case 4: return IPS;
                    case 5: return NO_DISPLAY;
                    case 6: return AUTODETECTION;
                    default: return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<DisplayType>
            internalGetValueMap() {
                return internalValueMap;
            }
            private static final com.google.protobuf.Internal.EnumLiteMap<
                    DisplayType> internalValueMap =
                    new com.google.protobuf.Internal.EnumLiteMap<DisplayType>() {
                        public DisplayType findValueByNumber(int number) {
                            return DisplayType.forNumber(number);
                        }
                    };

            public final com.google.protobuf.Descriptors.EnumValueDescriptor
            getValueDescriptor() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalStateException(
                            "Can't get the descriptor of an unrecognized enum value.");
                }
                return getDescriptor().getValues().get(ordinal());
            }
            public final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptorForType() {
                return getDescriptor();
            }
            public static final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptor() {
                return ForpostServer.getDescriptor().getEnumTypes().get(4);
            }

            private static final DisplayType[] VALUES = values();

            public static DisplayType valueOf(
                    com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException(
                            "EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[desc.getIndex()];
            }

            private final int value;

            private DisplayType(int value) {
                this.value = value;
            }

            // @@protoc_insertion_point(enum_scope:DisplayType)
        }

        /**
         * Protobuf enum {@code HandSensorType}
         */
        public enum HandSensorType
                implements com.google.protobuf.ProtocolMessageEnum {
            /**
             * <pre>
             * датчика нет
             * </pre>
             *
             * <code>NON_HAND_SENS = 0;</code>
             */
            NON_HAND_SENS(0),
            /**
             * <code>TTP223_ORIGINAL = 1;</code>
             */
            TTP223_ORIGINAL(1),
            /**
             * <code>TTP223_COPY = 2;</code>
             */
            TTP223_COPY(2),
            /**
             * <code>AT42QT1011 = 3;</code>
             */
            AT42QT1011(3),
            UNRECOGNIZED(-1),
            ;

            /**
             * <pre>
             * датчика нет
             * </pre>
             *
             * <code>NON_HAND_SENS = 0;</code>
             */
            public static final int NON_HAND_SENS_VALUE = 0;
            /**
             * <code>TTP223_ORIGINAL = 1;</code>
             */
            public static final int TTP223_ORIGINAL_VALUE = 1;
            /**
             * <code>TTP223_COPY = 2;</code>
             */
            public static final int TTP223_COPY_VALUE = 2;
            /**
             * <code>AT42QT1011 = 3;</code>
             */
            public static final int AT42QT1011_VALUE = 3;


            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException(
                            "Can't get the number of an unknown enum value.");
                }
                return value;
            }

            /**
             * @param value The numeric wire value of the corresponding enum entry.
             * @return The enum associated with the given numeric wire value.
             * @deprecated Use {@link #forNumber(int)} instead.
             */
            @Deprecated
            public static HandSensorType valueOf(int value) {
                return forNumber(value);
            }

            /**
             * @param value The numeric wire value of the corresponding enum entry.
             * @return The enum associated with the given numeric wire value.
             */
            public static HandSensorType forNumber(int value) {
                switch (value) {
                    case 0: return NON_HAND_SENS;
                    case 1: return TTP223_ORIGINAL;
                    case 2: return TTP223_COPY;
                    case 3: return AT42QT1011;
                    default: return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<HandSensorType>
            internalGetValueMap() {
                return internalValueMap;
            }
            private static final com.google.protobuf.Internal.EnumLiteMap<
                    HandSensorType> internalValueMap =
                    new com.google.protobuf.Internal.EnumLiteMap<HandSensorType>() {
                        public HandSensorType findValueByNumber(int number) {
                            return HandSensorType.forNumber(number);
                        }
                    };

            public final com.google.protobuf.Descriptors.EnumValueDescriptor
            getValueDescriptor() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalStateException(
                            "Can't get the descriptor of an unrecognized enum value.");
                }
                return getDescriptor().getValues().get(ordinal());
            }
            public final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptorForType() {
                return getDescriptor();
            }
            public static final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptor() {
                return ForpostServer.getDescriptor().getEnumTypes().get(5);
            }

            private static final HandSensorType[] VALUES = values();

            public static HandSensorType valueOf(
                    com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException(
                            "EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[desc.getIndex()];
            }

            private final int value;

            private HandSensorType(int value) {
                this.value = value;
            }

            // @@protoc_insertion_point(enum_scope:HandSensorType)
        }

        /**
         * Protobuf enum {@code SlaveType}
         */
        public enum SlaveType
                implements com.google.protobuf.ProtocolMessageEnum {
            /**
             * <code>SlaveType_Unknow = 0;</code>
             */
            SlaveType_Unknow(0),
            /**
             * <code>SlaveType_Hb_5_0 = 1;</code>
             */
            SlaveType_Hb_5_0(1),
            /**
             * <code>SlaveType_Hb_4_4 = 2;</code>
             */
            SlaveType_Hb_4_4(2),
            /**
             * <code>SlaveType_Vest_12 = 3;</code>
             */
            SlaveType_Vest_12(3),
            /**
             * <code>SlaveType_Vest_10 = 4;</code>
             */
            SlaveType_Vest_10(4),
            /**
             * <code>SlaveType_StressBelt = 5;</code>
             */
            SlaveType_StressBelt(5),
            /**
             * <code>SlaveType_Vest_3_0 = 6;</code>
             */
            SlaveType_Vest_3_0(6),
            UNRECOGNIZED(-1),
            ;

            /**
             * <code>SlaveType_Unknow = 0;</code>
             */
            public static final int SlaveType_Unknow_VALUE = 0;
            /**
             * <code>SlaveType_Hb_5_0 = 1;</code>
             */
            public static final int SlaveType_Hb_5_0_VALUE = 1;
            /**
             * <code>SlaveType_Hb_4_4 = 2;</code>
             */
            public static final int SlaveType_Hb_4_4_VALUE = 2;
            /**
             * <code>SlaveType_Vest_12 = 3;</code>
             */
            public static final int SlaveType_Vest_12_VALUE = 3;
            /**
             * <code>SlaveType_Vest_10 = 4;</code>
             */
            public static final int SlaveType_Vest_10_VALUE = 4;
            /**
             * <code>SlaveType_StressBelt = 5;</code>
             */
            public static final int SlaveType_StressBelt_VALUE = 5;
            /**
             * <code>SlaveType_Vest_3_0 = 6;</code>
             */
            public static final int SlaveType_Vest_3_0_VALUE = 6;


            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException(
                            "Can't get the number of an unknown enum value.");
                }
                return value;
            }

            /**
             * @param value The numeric wire value of the corresponding enum entry.
             * @return The enum associated with the given numeric wire value.
             * @deprecated Use {@link #forNumber(int)} instead.
             */
            @Deprecated
            public static SlaveType valueOf(int value) {
                return forNumber(value);
            }

            /**
             * @param value The numeric wire value of the corresponding enum entry.
             * @return The enum associated with the given numeric wire value.
             */
            public static SlaveType forNumber(int value) {
                switch (value) {
                    case 0: return SlaveType_Unknow;
                    case 1: return SlaveType_Hb_5_0;
                    case 2: return SlaveType_Hb_4_4;
                    case 3: return SlaveType_Vest_12;
                    case 4: return SlaveType_Vest_10;
                    case 5: return SlaveType_StressBelt;
                    case 6: return SlaveType_Vest_3_0;
                    default: return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<SlaveType>
            internalGetValueMap() {
                return internalValueMap;
            }
            private static final com.google.protobuf.Internal.EnumLiteMap<
                    SlaveType> internalValueMap =
                    new com.google.protobuf.Internal.EnumLiteMap<SlaveType>() {
                        public SlaveType findValueByNumber(int number) {
                            return SlaveType.forNumber(number);
                        }
                    };

            public final com.google.protobuf.Descriptors.EnumValueDescriptor
            getValueDescriptor() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalStateException(
                            "Can't get the descriptor of an unrecognized enum value.");
                }
                return getDescriptor().getValues().get(ordinal());
            }
            public final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptorForType() {
                return getDescriptor();
            }
            public static final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptor() {
                return ForpostServer.getDescriptor().getEnumTypes().get(6);
            }

            private static final SlaveType[] VALUES = values();

            public static SlaveType valueOf(
                    com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException(
                            "EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[desc.getIndex()];
            }

            private final int value;

            private SlaveType(int value) {
                this.value = value;
            }

            // @@protoc_insertion_point(enum_scope:SlaveType)
        }

        public interface HelloFromDevOrBuilder extends
                // @@protoc_insertion_point(interface_extends:HelloFromDev)
                com.google.protobuf.MessageOrBuilder {

            /**
             * <pre>
             * Игровой ID устройства
             * </pre>
             *
             * <code>int32 device_id = 1;</code>
             * @return The deviceId.
             */
            int getDeviceId();

            /**
             * <pre>
             * msec from start kit (internal clock)
             * </pre>
             *
             * <code>int32 kit_tick = 2;</code>
             * @return The kitTick.
             */
            int getKitTick();

            /**
             * <pre>
             * Eказатель на реконект к серверу значение (1) - повторное подключение, значение (0) - первое подключение
             * </pre>
             *
             * <code>bool was_early_connected = 3;</code>
             * @return The wasEarlyConnected.
             */
            boolean getWasEarlyConnected();

            /**
             * <pre>
             * DEPRECATED! Текущая версия прошивки
             * </pre>
             *
             * <code>int32 firmware_version = 4 [deprecated = true];</code>
             * @return The firmwareVersion.
             */
            @Deprecated int getFirmwareVersion();

            /**
             * <pre>
             * DEPRECATED! Глобальные изменения в тек.версии
             * </pre>
             *
             * <code>int32 global_changes = 5 [deprecated = true];</code>
             * @return The globalChanges.
             */
            @Deprecated int getGlobalChanges();

            /**
             * <pre>
             * DEPRECATED! Мелкие изменения в тек.версии
             * </pre>
             *
             * <code>int32 minor_changes = 6 [deprecated = true];</code>
             * @return The minorChanges.
             */
            @Deprecated int getMinorChanges();

            /**
             * <code>.DevType devtype = 7;</code>
             * @return The enum numeric value on the wire for devtype.
             */
            int getDevtypeValue();
            /**
             * <code>.DevType devtype = 7;</code>
             * @return The devtype.
             */
            DevType getDevtype();

            /**
             * <pre>
             * Физический номер флэш памяти
             * </pre>
             *
             * <code>int32 SerialNumber = 8;</code>
             * @return The serialNumber.
             */
            int getSerialNumber();

            /**
             * <pre>
             * Яркость светодиодов, (0 - 100, в %)
             * </pre>
             *
             * <code>uint32 diodes_brightness = 9;</code>
             * @return The diodesBrightness.
             */
            int getDiodesBrightness();

            /**
             * <pre>
             * Яркость дисплея, (0 - 100, в %)
             * </pre>
             *
             * <code>uint32 display_brightness = 10;</code>
             * @return The displayBrightness.
             */
            int getDisplayBrightness();

            /**
             * <pre>
             * Громкость устройства, (0 - 100, в %)
             * </pre>
             *
             * <code>uint32 sound_volume = 11;</code>
             * @return The soundVolume.
             */
            int getSoundVolume();

            /**
             * <pre>
             * Locale that currently used
             * </pre>
             *
             * <code>.LangugeType lang = 12;</code>
             * @return The enum numeric value on the wire for lang.
             */
            int getLangValue();
            /**
             * <pre>
             * Locale that currently used
             * </pre>
             *
             * <code>.LangugeType lang = 12;</code>
             * @return The lang.
             */
            LangugeType getLang();

            /**
             * <code>bytes firmware_ver = 13;</code>
             * @return The firmwareVer.
             */
            com.google.protobuf.ByteString getFirmwareVer();

            /**
             * <pre>
             * DEPRECATED! type of use display
             * </pre>
             *
             * <code>.DisplayType type_display = 14 [deprecated = true];</code>
             * @return The enum numeric value on the wire for typeDisplay.
             */
            @Deprecated int getTypeDisplayValue();
            /**
             * <pre>
             * DEPRECATED! type of use display
             * </pre>
             *
             * <code>.DisplayType type_display = 14 [deprecated = true];</code>
             * @return The typeDisplay.
             */
            @Deprecated DisplayType getTypeDisplay();

            /**
             * <pre>
             * версия бута устройства
             * </pre>
             *
             * <code>bytes bios_ver = 15;</code>
             * @return The biosVer.
             */
            com.google.protobuf.ByteString getBiosVer();

            /**
             * <pre>
             * версия биоса устройства
             * </pre>
             *
             * <code>bytes boot_ver = 16;</code>
             * @return The bootVer.
             */
            com.google.protobuf.ByteString getBootVer();
        }
        /**
         * <pre>
         * this is hello message, must be first message after connection
         * </pre>
         *
         * Protobuf type {@code HelloFromDev}
         */
        public static final class HelloFromDev extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:HelloFromDev)
                HelloFromDevOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use HelloFromDev.newBuilder() to construct.
            private HelloFromDev(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private HelloFromDev() {
                devtype_ = 0;
                lang_ = 0;
                firmwareVer_ = com.google.protobuf.ByteString.EMPTY;
                typeDisplay_ = 0;
                biosVer_ = com.google.protobuf.ByteString.EMPTY;
                bootVer_ = com.google.protobuf.ByteString.EMPTY;
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new HelloFromDev();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private HelloFromDev(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            case 8: {

                                deviceId_ = input.readInt32();
                                break;
                            }
                            case 16: {

                                kitTick_ = input.readInt32();
                                break;
                            }
                            case 24: {

                                wasEarlyConnected_ = input.readBool();
                                break;
                            }
                            case 32: {

                                firmwareVersion_ = input.readInt32();
                                break;
                            }
                            case 40: {

                                globalChanges_ = input.readInt32();
                                break;
                            }
                            case 48: {

                                minorChanges_ = input.readInt32();
                                break;
                            }
                            case 56: {
                                int rawValue = input.readEnum();

                                devtype_ = rawValue;
                                break;
                            }
                            case 64: {

                                serialNumber_ = input.readInt32();
                                break;
                            }
                            case 72: {

                                diodesBrightness_ = input.readUInt32();
                                break;
                            }
                            case 80: {

                                displayBrightness_ = input.readUInt32();
                                break;
                            }
                            case 88: {

                                soundVolume_ = input.readUInt32();
                                break;
                            }
                            case 96: {
                                int rawValue = input.readEnum();

                                lang_ = rawValue;
                                break;
                            }
                            case 106: {

                                firmwareVer_ = input.readBytes();
                                break;
                            }
                            case 112: {
                                int rawValue = input.readEnum();

                                typeDisplay_ = rawValue;
                                break;
                            }
                            case 122: {

                                biosVer_ = input.readBytes();
                                break;
                            }
                            case 130: {

                                bootVer_ = input.readBytes();
                                break;
                            }
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_HelloFromDev_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_HelloFromDev_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                HelloFromDev.class, Builder.class);
            }

            public static final int DEVICE_ID_FIELD_NUMBER = 1;
            private int deviceId_;
            /**
             * <pre>
             * Игровой ID устройства
             * </pre>
             *
             * <code>int32 device_id = 1;</code>
             * @return The deviceId.
             */
            @Override
            public int getDeviceId() {
                return deviceId_;
            }

            public static final int KIT_TICK_FIELD_NUMBER = 2;
            private int kitTick_;
            /**
             * <pre>
             * msec from start kit (internal clock)
             * </pre>
             *
             * <code>int32 kit_tick = 2;</code>
             * @return The kitTick.
             */
            @Override
            public int getKitTick() {
                return kitTick_;
            }

            public static final int WAS_EARLY_CONNECTED_FIELD_NUMBER = 3;
            private boolean wasEarlyConnected_;
            /**
             * <pre>
             * Eказатель на реконект к серверу значение (1) - повторное подключение, значение (0) - первое подключение
             * </pre>
             *
             * <code>bool was_early_connected = 3;</code>
             * @return The wasEarlyConnected.
             */
            @Override
            public boolean getWasEarlyConnected() {
                return wasEarlyConnected_;
            }

            public static final int FIRMWARE_VERSION_FIELD_NUMBER = 4;
            private int firmwareVersion_;
            /**
             * <pre>
             * DEPRECATED! Текущая версия прошивки
             * </pre>
             *
             * <code>int32 firmware_version = 4 [deprecated = true];</code>
             * @return The firmwareVersion.
             */
            @Override
            @Deprecated public int getFirmwareVersion() {
                return firmwareVersion_;
            }

            public static final int GLOBAL_CHANGES_FIELD_NUMBER = 5;
            private int globalChanges_;
            /**
             * <pre>
             * DEPRECATED! Глобальные изменения в тек.версии
             * </pre>
             *
             * <code>int32 global_changes = 5 [deprecated = true];</code>
             * @return The globalChanges.
             */
            @Override
            @Deprecated public int getGlobalChanges() {
                return globalChanges_;
            }

            public static final int MINOR_CHANGES_FIELD_NUMBER = 6;
            private int minorChanges_;
            /**
             * <pre>
             * DEPRECATED! Мелкие изменения в тек.версии
             * </pre>
             *
             * <code>int32 minor_changes = 6 [deprecated = true];</code>
             * @return The minorChanges.
             */
            @Override
            @Deprecated public int getMinorChanges() {
                return minorChanges_;
            }

            public static final int DEVTYPE_FIELD_NUMBER = 7;
            private int devtype_;
            /**
             * <code>.DevType devtype = 7;</code>
             * @return The enum numeric value on the wire for devtype.
             */
            @Override public int getDevtypeValue() {
                return devtype_;
            }
            /**
             * <code>.DevType devtype = 7;</code>
             * @return The devtype.
             */
            @Override public DevType getDevtype() {
                @SuppressWarnings("deprecation")
                DevType result = DevType.valueOf(devtype_);
                return result == null ? DevType.UNRECOGNIZED : result;
            }

            public static final int SERIALNUMBER_FIELD_NUMBER = 8;
            private int serialNumber_;
            /**
             * <pre>
             * Физический номер флэш памяти
             * </pre>
             *
             * <code>int32 SerialNumber = 8;</code>
             * @return The serialNumber.
             */
            @Override
            public int getSerialNumber() {
                return serialNumber_;
            }

            public static final int DIODES_BRIGHTNESS_FIELD_NUMBER = 9;
            private int diodesBrightness_;
            /**
             * <pre>
             * Яркость светодиодов, (0 - 100, в %)
             * </pre>
             *
             * <code>uint32 diodes_brightness = 9;</code>
             * @return The diodesBrightness.
             */
            @Override
            public int getDiodesBrightness() {
                return diodesBrightness_;
            }

            public static final int DISPLAY_BRIGHTNESS_FIELD_NUMBER = 10;
            private int displayBrightness_;
            /**
             * <pre>
             * Яркость дисплея, (0 - 100, в %)
             * </pre>
             *
             * <code>uint32 display_brightness = 10;</code>
             * @return The displayBrightness.
             */
            @Override
            public int getDisplayBrightness() {
                return displayBrightness_;
            }

            public static final int SOUND_VOLUME_FIELD_NUMBER = 11;
            private int soundVolume_;
            /**
             * <pre>
             * Громкость устройства, (0 - 100, в %)
             * </pre>
             *
             * <code>uint32 sound_volume = 11;</code>
             * @return The soundVolume.
             */
            @Override
            public int getSoundVolume() {
                return soundVolume_;
            }

            public static final int LANG_FIELD_NUMBER = 12;
            private int lang_;
            /**
             * <pre>
             * Locale that currently used
             * </pre>
             *
             * <code>.LangugeType lang = 12;</code>
             * @return The enum numeric value on the wire for lang.
             */
            @Override public int getLangValue() {
                return lang_;
            }
            /**
             * <pre>
             * Locale that currently used
             * </pre>
             *
             * <code>.LangugeType lang = 12;</code>
             * @return The lang.
             */
            @Override public LangugeType getLang() {
                @SuppressWarnings("deprecation")
                LangugeType result = LangugeType.valueOf(lang_);
                return result == null ? LangugeType.UNRECOGNIZED : result;
            }

            public static final int FIRMWARE_VER_FIELD_NUMBER = 13;
            private com.google.protobuf.ByteString firmwareVer_;
            /**
             * <code>bytes firmware_ver = 13;</code>
             * @return The firmwareVer.
             */
            @Override
            public com.google.protobuf.ByteString getFirmwareVer() {
                return firmwareVer_;
            }

            public static final int TYPE_DISPLAY_FIELD_NUMBER = 14;
            private int typeDisplay_;
            /**
             * <pre>
             * DEPRECATED! type of use display
             * </pre>
             *
             * <code>.DisplayType type_display = 14 [deprecated = true];</code>
             * @return The enum numeric value on the wire for typeDisplay.
             */
            @Override @Deprecated public int getTypeDisplayValue() {
                return typeDisplay_;
            }
            /**
             * <pre>
             * DEPRECATED! type of use display
             * </pre>
             *
             * <code>.DisplayType type_display = 14 [deprecated = true];</code>
             * @return The typeDisplay.
             */
            @Override @Deprecated public DisplayType getTypeDisplay() {
                @SuppressWarnings("deprecation")
                DisplayType result = DisplayType.valueOf(typeDisplay_);
                return result == null ? DisplayType.UNRECOGNIZED : result;
            }

            public static final int BIOS_VER_FIELD_NUMBER = 15;
            private com.google.protobuf.ByteString biosVer_;
            /**
             * <pre>
             * версия бута устройства
             * </pre>
             *
             * <code>bytes bios_ver = 15;</code>
             * @return The biosVer.
             */
            @Override
            public com.google.protobuf.ByteString getBiosVer() {
                return biosVer_;
            }

            public static final int BOOT_VER_FIELD_NUMBER = 16;
            private com.google.protobuf.ByteString bootVer_;
            /**
             * <pre>
             * версия биоса устройства
             * </pre>
             *
             * <code>bytes boot_ver = 16;</code>
             * @return The bootVer.
             */
            @Override
            public com.google.protobuf.ByteString getBootVer() {
                return bootVer_;
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                if (deviceId_ != 0) {
                    output.writeInt32(1, deviceId_);
                }
                if (kitTick_ != 0) {
                    output.writeInt32(2, kitTick_);
                }
                if (wasEarlyConnected_ != false) {
                    output.writeBool(3, wasEarlyConnected_);
                }
                if (firmwareVersion_ != 0) {
                    output.writeInt32(4, firmwareVersion_);
                }
                if (globalChanges_ != 0) {
                    output.writeInt32(5, globalChanges_);
                }
                if (minorChanges_ != 0) {
                    output.writeInt32(6, minorChanges_);
                }
                if (devtype_ != DevType.UNKNOWN.getNumber()) {
                    output.writeEnum(7, devtype_);
                }
                if (serialNumber_ != 0) {
                    output.writeInt32(8, serialNumber_);
                }
                if (diodesBrightness_ != 0) {
                    output.writeUInt32(9, diodesBrightness_);
                }
                if (displayBrightness_ != 0) {
                    output.writeUInt32(10, displayBrightness_);
                }
                if (soundVolume_ != 0) {
                    output.writeUInt32(11, soundVolume_);
                }
                if (lang_ != LangugeType.LANG_UNKNOWN.getNumber()) {
                    output.writeEnum(12, lang_);
                }
                if (!firmwareVer_.isEmpty()) {
                    output.writeBytes(13, firmwareVer_);
                }
                if (typeDisplay_ != DisplayType.UNDEFINE.getNumber()) {
                    output.writeEnum(14, typeDisplay_);
                }
                if (!biosVer_.isEmpty()) {
                    output.writeBytes(15, biosVer_);
                }
                if (!bootVer_.isEmpty()) {
                    output.writeBytes(16, bootVer_);
                }
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                if (deviceId_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(1, deviceId_);
                }
                if (kitTick_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(2, kitTick_);
                }
                if (wasEarlyConnected_ != false) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBoolSize(3, wasEarlyConnected_);
                }
                if (firmwareVersion_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(4, firmwareVersion_);
                }
                if (globalChanges_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(5, globalChanges_);
                }
                if (minorChanges_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(6, minorChanges_);
                }
                if (devtype_ != DevType.UNKNOWN.getNumber()) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeEnumSize(7, devtype_);
                }
                if (serialNumber_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(8, serialNumber_);
                }
                if (diodesBrightness_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeUInt32Size(9, diodesBrightness_);
                }
                if (displayBrightness_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeUInt32Size(10, displayBrightness_);
                }
                if (soundVolume_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeUInt32Size(11, soundVolume_);
                }
                if (lang_ != LangugeType.LANG_UNKNOWN.getNumber()) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeEnumSize(12, lang_);
                }
                if (!firmwareVer_.isEmpty()) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(13, firmwareVer_);
                }
                if (typeDisplay_ != DisplayType.UNDEFINE.getNumber()) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeEnumSize(14, typeDisplay_);
                }
                if (!biosVer_.isEmpty()) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(15, biosVer_);
                }
                if (!bootVer_.isEmpty()) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(16, bootVer_);
                }
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof HelloFromDev)) {
                    return super.equals(obj);
                }
                HelloFromDev other = (HelloFromDev) obj;

                if (getDeviceId()
                        != other.getDeviceId()) return false;
                if (getKitTick()
                        != other.getKitTick()) return false;
                if (getWasEarlyConnected()
                        != other.getWasEarlyConnected()) return false;
                if (getFirmwareVersion()
                        != other.getFirmwareVersion()) return false;
                if (getGlobalChanges()
                        != other.getGlobalChanges()) return false;
                if (getMinorChanges()
                        != other.getMinorChanges()) return false;
                if (devtype_ != other.devtype_) return false;
                if (getSerialNumber()
                        != other.getSerialNumber()) return false;
                if (getDiodesBrightness()
                        != other.getDiodesBrightness()) return false;
                if (getDisplayBrightness()
                        != other.getDisplayBrightness()) return false;
                if (getSoundVolume()
                        != other.getSoundVolume()) return false;
                if (lang_ != other.lang_) return false;
                if (!getFirmwareVer()
                        .equals(other.getFirmwareVer())) return false;
                if (typeDisplay_ != other.typeDisplay_) return false;
                if (!getBiosVer()
                        .equals(other.getBiosVer())) return false;
                if (!getBootVer()
                        .equals(other.getBootVer())) return false;
                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                hash = (37 * hash) + DEVICE_ID_FIELD_NUMBER;
                hash = (53 * hash) + getDeviceId();
                hash = (37 * hash) + KIT_TICK_FIELD_NUMBER;
                hash = (53 * hash) + getKitTick();
                hash = (37 * hash) + WAS_EARLY_CONNECTED_FIELD_NUMBER;
                hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
                        getWasEarlyConnected());
                hash = (37 * hash) + FIRMWARE_VERSION_FIELD_NUMBER;
                hash = (53 * hash) + getFirmwareVersion();
                hash = (37 * hash) + GLOBAL_CHANGES_FIELD_NUMBER;
                hash = (53 * hash) + getGlobalChanges();
                hash = (37 * hash) + MINOR_CHANGES_FIELD_NUMBER;
                hash = (53 * hash) + getMinorChanges();
                hash = (37 * hash) + DEVTYPE_FIELD_NUMBER;
                hash = (53 * hash) + devtype_;
                hash = (37 * hash) + SERIALNUMBER_FIELD_NUMBER;
                hash = (53 * hash) + getSerialNumber();
                hash = (37 * hash) + DIODES_BRIGHTNESS_FIELD_NUMBER;
                hash = (53 * hash) + getDiodesBrightness();
                hash = (37 * hash) + DISPLAY_BRIGHTNESS_FIELD_NUMBER;
                hash = (53 * hash) + getDisplayBrightness();
                hash = (37 * hash) + SOUND_VOLUME_FIELD_NUMBER;
                hash = (53 * hash) + getSoundVolume();
                hash = (37 * hash) + LANG_FIELD_NUMBER;
                hash = (53 * hash) + lang_;
                hash = (37 * hash) + FIRMWARE_VER_FIELD_NUMBER;
                hash = (53 * hash) + getFirmwareVer().hashCode();
                hash = (37 * hash) + TYPE_DISPLAY_FIELD_NUMBER;
                hash = (53 * hash) + typeDisplay_;
                hash = (37 * hash) + BIOS_VER_FIELD_NUMBER;
                hash = (53 * hash) + getBiosVer().hashCode();
                hash = (37 * hash) + BOOT_VER_FIELD_NUMBER;
                hash = (53 * hash) + getBootVer().hashCode();
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static HelloFromDev parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static HelloFromDev parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static HelloFromDev parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static HelloFromDev parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static HelloFromDev parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static HelloFromDev parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static HelloFromDev parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static HelloFromDev parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static HelloFromDev parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static HelloFromDev parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static HelloFromDev parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static HelloFromDev parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(HelloFromDev prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * <pre>
             * this is hello message, must be first message after connection
             * </pre>
             *
             * Protobuf type {@code HelloFromDev}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:HelloFromDev)
                    HelloFromDevOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_HelloFromDev_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_HelloFromDev_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    HelloFromDev.class, Builder.class);
                }

                // Construct using ForpostServer.HelloFromDev.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    deviceId_ = 0;

                    kitTick_ = 0;

                    wasEarlyConnected_ = false;

                    firmwareVersion_ = 0;

                    globalChanges_ = 0;

                    minorChanges_ = 0;

                    devtype_ = 0;

                    serialNumber_ = 0;

                    diodesBrightness_ = 0;

                    displayBrightness_ = 0;

                    soundVolume_ = 0;

                    lang_ = 0;

                    firmwareVer_ = com.google.protobuf.ByteString.EMPTY;

                    typeDisplay_ = 0;

                    biosVer_ = com.google.protobuf.ByteString.EMPTY;

                    bootVer_ = com.google.protobuf.ByteString.EMPTY;

                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_HelloFromDev_descriptor;
                }

                @Override
                public HelloFromDev getDefaultInstanceForType() {
                    return HelloFromDev.getDefaultInstance();
                }

                @Override
                public HelloFromDev build() {
                    HelloFromDev result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public HelloFromDev buildPartial() {
                    HelloFromDev result = new HelloFromDev(this);
                    result.deviceId_ = deviceId_;
                    result.kitTick_ = kitTick_;
                    result.wasEarlyConnected_ = wasEarlyConnected_;
                    result.firmwareVersion_ = firmwareVersion_;
                    result.globalChanges_ = globalChanges_;
                    result.minorChanges_ = minorChanges_;
                    result.devtype_ = devtype_;
                    result.serialNumber_ = serialNumber_;
                    result.diodesBrightness_ = diodesBrightness_;
                    result.displayBrightness_ = displayBrightness_;
                    result.soundVolume_ = soundVolume_;
                    result.lang_ = lang_;
                    result.firmwareVer_ = firmwareVer_;
                    result.typeDisplay_ = typeDisplay_;
                    result.biosVer_ = biosVer_;
                    result.bootVer_ = bootVer_;
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof HelloFromDev) {
                        return mergeFrom((HelloFromDev)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(HelloFromDev other) {
                    if (other == HelloFromDev.getDefaultInstance()) return this;
                    if (other.getDeviceId() != 0) {
                        setDeviceId(other.getDeviceId());
                    }
                    if (other.getKitTick() != 0) {
                        setKitTick(other.getKitTick());
                    }
                    if (other.getWasEarlyConnected() != false) {
                        setWasEarlyConnected(other.getWasEarlyConnected());
                    }
                    if (other.getFirmwareVersion() != 0) {
                        setFirmwareVersion(other.getFirmwareVersion());
                    }
                    if (other.getGlobalChanges() != 0) {
                        setGlobalChanges(other.getGlobalChanges());
                    }
                    if (other.getMinorChanges() != 0) {
                        setMinorChanges(other.getMinorChanges());
                    }
                    if (other.devtype_ != 0) {
                        setDevtypeValue(other.getDevtypeValue());
                    }
                    if (other.getSerialNumber() != 0) {
                        setSerialNumber(other.getSerialNumber());
                    }
                    if (other.getDiodesBrightness() != 0) {
                        setDiodesBrightness(other.getDiodesBrightness());
                    }
                    if (other.getDisplayBrightness() != 0) {
                        setDisplayBrightness(other.getDisplayBrightness());
                    }
                    if (other.getSoundVolume() != 0) {
                        setSoundVolume(other.getSoundVolume());
                    }
                    if (other.lang_ != 0) {
                        setLangValue(other.getLangValue());
                    }
                    if (other.getFirmwareVer() != com.google.protobuf.ByteString.EMPTY) {
                        setFirmwareVer(other.getFirmwareVer());
                    }
                    if (other.typeDisplay_ != 0) {
                        setTypeDisplayValue(other.getTypeDisplayValue());
                    }
                    if (other.getBiosVer() != com.google.protobuf.ByteString.EMPTY) {
                        setBiosVer(other.getBiosVer());
                    }
                    if (other.getBootVer() != com.google.protobuf.ByteString.EMPTY) {
                        setBootVer(other.getBootVer());
                    }
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    HelloFromDev parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (HelloFromDev) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }

                private int deviceId_ ;
                /**
                 * <pre>
                 * Игровой ID устройства
                 * </pre>
                 *
                 * <code>int32 device_id = 1;</code>
                 * @return The deviceId.
                 */
                @Override
                public int getDeviceId() {
                    return deviceId_;
                }
                /**
                 * <pre>
                 * Игровой ID устройства
                 * </pre>
                 *
                 * <code>int32 device_id = 1;</code>
                 * @param value The deviceId to set.
                 * @return This builder for chaining.
                 */
                public Builder setDeviceId(int value) {

                    deviceId_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * Игровой ID устройства
                 * </pre>
                 *
                 * <code>int32 device_id = 1;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearDeviceId() {

                    deviceId_ = 0;
                    onChanged();
                    return this;
                }

                private int kitTick_ ;
                /**
                 * <pre>
                 * msec from start kit (internal clock)
                 * </pre>
                 *
                 * <code>int32 kit_tick = 2;</code>
                 * @return The kitTick.
                 */
                @Override
                public int getKitTick() {
                    return kitTick_;
                }
                /**
                 * <pre>
                 * msec from start kit (internal clock)
                 * </pre>
                 *
                 * <code>int32 kit_tick = 2;</code>
                 * @param value The kitTick to set.
                 * @return This builder for chaining.
                 */
                public Builder setKitTick(int value) {

                    kitTick_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * msec from start kit (internal clock)
                 * </pre>
                 *
                 * <code>int32 kit_tick = 2;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearKitTick() {

                    kitTick_ = 0;
                    onChanged();
                    return this;
                }

                private boolean wasEarlyConnected_ ;
                /**
                 * <pre>
                 * Eказатель на реконект к серверу значение (1) - повторное подключение, значение (0) - первое подключение
                 * </pre>
                 *
                 * <code>bool was_early_connected = 3;</code>
                 * @return The wasEarlyConnected.
                 */
                @Override
                public boolean getWasEarlyConnected() {
                    return wasEarlyConnected_;
                }
                /**
                 * <pre>
                 * Eказатель на реконект к серверу значение (1) - повторное подключение, значение (0) - первое подключение
                 * </pre>
                 *
                 * <code>bool was_early_connected = 3;</code>
                 * @param value The wasEarlyConnected to set.
                 * @return This builder for chaining.
                 */
                public Builder setWasEarlyConnected(boolean value) {

                    wasEarlyConnected_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * Eказатель на реконект к серверу значение (1) - повторное подключение, значение (0) - первое подключение
                 * </pre>
                 *
                 * <code>bool was_early_connected = 3;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearWasEarlyConnected() {

                    wasEarlyConnected_ = false;
                    onChanged();
                    return this;
                }

                private int firmwareVersion_ ;
                /**
                 * <pre>
                 * DEPRECATED! Текущая версия прошивки
                 * </pre>
                 *
                 * <code>int32 firmware_version = 4 [deprecated = true];</code>
                 * @return The firmwareVersion.
                 */
                @Override
                @Deprecated public int getFirmwareVersion() {
                    return firmwareVersion_;
                }
                /**
                 * <pre>
                 * DEPRECATED! Текущая версия прошивки
                 * </pre>
                 *
                 * <code>int32 firmware_version = 4 [deprecated = true];</code>
                 * @param value The firmwareVersion to set.
                 * @return This builder for chaining.
                 */
                @Deprecated public Builder setFirmwareVersion(int value) {

                    firmwareVersion_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * DEPRECATED! Текущая версия прошивки
                 * </pre>
                 *
                 * <code>int32 firmware_version = 4 [deprecated = true];</code>
                 * @return This builder for chaining.
                 */
                @Deprecated public Builder clearFirmwareVersion() {

                    firmwareVersion_ = 0;
                    onChanged();
                    return this;
                }

                private int globalChanges_ ;
                /**
                 * <pre>
                 * DEPRECATED! Глобальные изменения в тек.версии
                 * </pre>
                 *
                 * <code>int32 global_changes = 5 [deprecated = true];</code>
                 * @return The globalChanges.
                 */
                @Override
                @Deprecated public int getGlobalChanges() {
                    return globalChanges_;
                }
                /**
                 * <pre>
                 * DEPRECATED! Глобальные изменения в тек.версии
                 * </pre>
                 *
                 * <code>int32 global_changes = 5 [deprecated = true];</code>
                 * @param value The globalChanges to set.
                 * @return This builder for chaining.
                 */
                @Deprecated public Builder setGlobalChanges(int value) {

                    globalChanges_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * DEPRECATED! Глобальные изменения в тек.версии
                 * </pre>
                 *
                 * <code>int32 global_changes = 5 [deprecated = true];</code>
                 * @return This builder for chaining.
                 */
                @Deprecated public Builder clearGlobalChanges() {

                    globalChanges_ = 0;
                    onChanged();
                    return this;
                }

                private int minorChanges_ ;
                /**
                 * <pre>
                 * DEPRECATED! Мелкие изменения в тек.версии
                 * </pre>
                 *
                 * <code>int32 minor_changes = 6 [deprecated = true];</code>
                 * @return The minorChanges.
                 */
                @Override
                @Deprecated public int getMinorChanges() {
                    return minorChanges_;
                }
                /**
                 * <pre>
                 * DEPRECATED! Мелкие изменения в тек.версии
                 * </pre>
                 *
                 * <code>int32 minor_changes = 6 [deprecated = true];</code>
                 * @param value The minorChanges to set.
                 * @return This builder for chaining.
                 */
                @Deprecated public Builder setMinorChanges(int value) {

                    minorChanges_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * DEPRECATED! Мелкие изменения в тек.версии
                 * </pre>
                 *
                 * <code>int32 minor_changes = 6 [deprecated = true];</code>
                 * @return This builder for chaining.
                 */
                @Deprecated public Builder clearMinorChanges() {

                    minorChanges_ = 0;
                    onChanged();
                    return this;
                }

                private int devtype_ = 0;
                /**
                 * <code>.DevType devtype = 7;</code>
                 * @return The enum numeric value on the wire for devtype.
                 */
                @Override public int getDevtypeValue() {
                    return devtype_;
                }
                /**
                 * <code>.DevType devtype = 7;</code>
                 * @param value The enum numeric value on the wire for devtype to set.
                 * @return This builder for chaining.
                 */
                public Builder setDevtypeValue(int value) {

                    devtype_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>.DevType devtype = 7;</code>
                 * @return The devtype.
                 */
                @Override
                public DevType getDevtype() {
                    @SuppressWarnings("deprecation")
                    DevType result = DevType.valueOf(devtype_);
                    return result == null ? DevType.UNRECOGNIZED : result;
                }
                /**
                 * <code>.DevType devtype = 7;</code>
                 * @param value The devtype to set.
                 * @return This builder for chaining.
                 */
                public Builder setDevtype(DevType value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    devtype_ = value.getNumber();
                    onChanged();
                    return this;
                }
                /**
                 * <code>.DevType devtype = 7;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearDevtype() {

                    devtype_ = 0;
                    onChanged();
                    return this;
                }

                private int serialNumber_ ;
                /**
                 * <pre>
                 * Физический номер флэш памяти
                 * </pre>
                 *
                 * <code>int32 SerialNumber = 8;</code>
                 * @return The serialNumber.
                 */
                @Override
                public int getSerialNumber() {
                    return serialNumber_;
                }
                /**
                 * <pre>
                 * Физический номер флэш памяти
                 * </pre>
                 *
                 * <code>int32 SerialNumber = 8;</code>
                 * @param value The serialNumber to set.
                 * @return This builder for chaining.
                 */
                public Builder setSerialNumber(int value) {

                    serialNumber_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * Физический номер флэш памяти
                 * </pre>
                 *
                 * <code>int32 SerialNumber = 8;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearSerialNumber() {

                    serialNumber_ = 0;
                    onChanged();
                    return this;
                }

                private int diodesBrightness_ ;
                /**
                 * <pre>
                 * Яркость светодиодов, (0 - 100, в %)
                 * </pre>
                 *
                 * <code>uint32 diodes_brightness = 9;</code>
                 * @return The diodesBrightness.
                 */
                @Override
                public int getDiodesBrightness() {
                    return diodesBrightness_;
                }
                /**
                 * <pre>
                 * Яркость светодиодов, (0 - 100, в %)
                 * </pre>
                 *
                 * <code>uint32 diodes_brightness = 9;</code>
                 * @param value The diodesBrightness to set.
                 * @return This builder for chaining.
                 */
                public Builder setDiodesBrightness(int value) {

                    diodesBrightness_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * Яркость светодиодов, (0 - 100, в %)
                 * </pre>
                 *
                 * <code>uint32 diodes_brightness = 9;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearDiodesBrightness() {

                    diodesBrightness_ = 0;
                    onChanged();
                    return this;
                }

                private int displayBrightness_ ;
                /**
                 * <pre>
                 * Яркость дисплея, (0 - 100, в %)
                 * </pre>
                 *
                 * <code>uint32 display_brightness = 10;</code>
                 * @return The displayBrightness.
                 */
                @Override
                public int getDisplayBrightness() {
                    return displayBrightness_;
                }
                /**
                 * <pre>
                 * Яркость дисплея, (0 - 100, в %)
                 * </pre>
                 *
                 * <code>uint32 display_brightness = 10;</code>
                 * @param value The displayBrightness to set.
                 * @return This builder for chaining.
                 */
                public Builder setDisplayBrightness(int value) {

                    displayBrightness_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * Яркость дисплея, (0 - 100, в %)
                 * </pre>
                 *
                 * <code>uint32 display_brightness = 10;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearDisplayBrightness() {

                    displayBrightness_ = 0;
                    onChanged();
                    return this;
                }

                private int soundVolume_ ;
                /**
                 * <pre>
                 * Громкость устройства, (0 - 100, в %)
                 * </pre>
                 *
                 * <code>uint32 sound_volume = 11;</code>
                 * @return The soundVolume.
                 */
                @Override
                public int getSoundVolume() {
                    return soundVolume_;
                }
                /**
                 * <pre>
                 * Громкость устройства, (0 - 100, в %)
                 * </pre>
                 *
                 * <code>uint32 sound_volume = 11;</code>
                 * @param value The soundVolume to set.
                 * @return This builder for chaining.
                 */
                public Builder setSoundVolume(int value) {

                    soundVolume_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * Громкость устройства, (0 - 100, в %)
                 * </pre>
                 *
                 * <code>uint32 sound_volume = 11;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearSoundVolume() {

                    soundVolume_ = 0;
                    onChanged();
                    return this;
                }

                private int lang_ = 0;
                /**
                 * <pre>
                 * Locale that currently used
                 * </pre>
                 *
                 * <code>.LangugeType lang = 12;</code>
                 * @return The enum numeric value on the wire for lang.
                 */
                @Override public int getLangValue() {
                    return lang_;
                }
                /**
                 * <pre>
                 * Locale that currently used
                 * </pre>
                 *
                 * <code>.LangugeType lang = 12;</code>
                 * @param value The enum numeric value on the wire for lang to set.
                 * @return This builder for chaining.
                 */
                public Builder setLangValue(int value) {

                    lang_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * Locale that currently used
                 * </pre>
                 *
                 * <code>.LangugeType lang = 12;</code>
                 * @return The lang.
                 */
                @Override
                public LangugeType getLang() {
                    @SuppressWarnings("deprecation")
                    LangugeType result = LangugeType.valueOf(lang_);
                    return result == null ? LangugeType.UNRECOGNIZED : result;
                }
                /**
                 * <pre>
                 * Locale that currently used
                 * </pre>
                 *
                 * <code>.LangugeType lang = 12;</code>
                 * @param value The lang to set.
                 * @return This builder for chaining.
                 */
                public Builder setLang(LangugeType value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    lang_ = value.getNumber();
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * Locale that currently used
                 * </pre>
                 *
                 * <code>.LangugeType lang = 12;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearLang() {

                    lang_ = 0;
                    onChanged();
                    return this;
                }

                private com.google.protobuf.ByteString firmwareVer_ = com.google.protobuf.ByteString.EMPTY;
                /**
                 * <code>bytes firmware_ver = 13;</code>
                 * @return The firmwareVer.
                 */
                @Override
                public com.google.protobuf.ByteString getFirmwareVer() {
                    return firmwareVer_;
                }
                /**
                 * <code>bytes firmware_ver = 13;</code>
                 * @param value The firmwareVer to set.
                 * @return This builder for chaining.
                 */
                public Builder setFirmwareVer(com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    firmwareVer_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>bytes firmware_ver = 13;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearFirmwareVer() {

                    firmwareVer_ = getDefaultInstance().getFirmwareVer();
                    onChanged();
                    return this;
                }

                private int typeDisplay_ = 0;
                /**
                 * <pre>
                 * DEPRECATED! type of use display
                 * </pre>
                 *
                 * <code>.DisplayType type_display = 14 [deprecated = true];</code>
                 * @return The enum numeric value on the wire for typeDisplay.
                 */
                @Override @Deprecated public int getTypeDisplayValue() {
                    return typeDisplay_;
                }
                /**
                 * <pre>
                 * DEPRECATED! type of use display
                 * </pre>
                 *
                 * <code>.DisplayType type_display = 14 [deprecated = true];</code>
                 * @param value The enum numeric value on the wire for typeDisplay to set.
                 * @return This builder for chaining.
                 */
                @Deprecated public Builder setTypeDisplayValue(int value) {

                    typeDisplay_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * DEPRECATED! type of use display
                 * </pre>
                 *
                 * <code>.DisplayType type_display = 14 [deprecated = true];</code>
                 * @return The typeDisplay.
                 */
                @Override
                @Deprecated public DisplayType getTypeDisplay() {
                    @SuppressWarnings("deprecation")
                    DisplayType result = DisplayType.valueOf(typeDisplay_);
                    return result == null ? DisplayType.UNRECOGNIZED : result;
                }
                /**
                 * <pre>
                 * DEPRECATED! type of use display
                 * </pre>
                 *
                 * <code>.DisplayType type_display = 14 [deprecated = true];</code>
                 * @param value The typeDisplay to set.
                 * @return This builder for chaining.
                 */
                @Deprecated public Builder setTypeDisplay(DisplayType value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    typeDisplay_ = value.getNumber();
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * DEPRECATED! type of use display
                 * </pre>
                 *
                 * <code>.DisplayType type_display = 14 [deprecated = true];</code>
                 * @return This builder for chaining.
                 */
                @Deprecated public Builder clearTypeDisplay() {

                    typeDisplay_ = 0;
                    onChanged();
                    return this;
                }

                private com.google.protobuf.ByteString biosVer_ = com.google.protobuf.ByteString.EMPTY;
                /**
                 * <pre>
                 * версия бута устройства
                 * </pre>
                 *
                 * <code>bytes bios_ver = 15;</code>
                 * @return The biosVer.
                 */
                @Override
                public com.google.protobuf.ByteString getBiosVer() {
                    return biosVer_;
                }
                /**
                 * <pre>
                 * версия бута устройства
                 * </pre>
                 *
                 * <code>bytes bios_ver = 15;</code>
                 * @param value The biosVer to set.
                 * @return This builder for chaining.
                 */
                public Builder setBiosVer(com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    biosVer_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * версия бута устройства
                 * </pre>
                 *
                 * <code>bytes bios_ver = 15;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearBiosVer() {

                    biosVer_ = getDefaultInstance().getBiosVer();
                    onChanged();
                    return this;
                }

                private com.google.protobuf.ByteString bootVer_ = com.google.protobuf.ByteString.EMPTY;
                /**
                 * <pre>
                 * версия биоса устройства
                 * </pre>
                 *
                 * <code>bytes boot_ver = 16;</code>
                 * @return The bootVer.
                 */
                @Override
                public com.google.protobuf.ByteString getBootVer() {
                    return bootVer_;
                }
                /**
                 * <pre>
                 * версия биоса устройства
                 * </pre>
                 *
                 * <code>bytes boot_ver = 16;</code>
                 * @param value The bootVer to set.
                 * @return This builder for chaining.
                 */
                public Builder setBootVer(com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    bootVer_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * версия биоса устройства
                 * </pre>
                 *
                 * <code>bytes boot_ver = 16;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearBootVer() {

                    bootVer_ = getDefaultInstance().getBootVer();
                    onChanged();
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:HelloFromDev)
            }

            // @@protoc_insertion_point(class_scope:HelloFromDev)
            private static final HelloFromDev DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new HelloFromDev();
            }

            public static HelloFromDev getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<HelloFromDev>
                    PARSER = new com.google.protobuf.AbstractParser<HelloFromDev>() {
                @Override
                public HelloFromDev parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new HelloFromDev(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<HelloFromDev> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<HelloFromDev> getParserForType() {
                return PARSER;
            }

            @Override
            public HelloFromDev getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface StatByIdOrBuilder extends
                // @@protoc_insertion_point(interface_extends:StatById)
                com.google.protobuf.MessageOrBuilder {

            /**
             * <pre>
             * Идентификационный номер комплекта
             * </pre>
             *
             * <code>int32 id = 1;</code>
             * @return The id.
             */
            int getId();

            /**
             * <pre>
             * Кол-во полученного урона
             * </pre>
             *
             * <code>int32 damage = 2;</code>
             * @return The damage.
             */
            int getDamage();

            /**
             * <pre>
             * Кол-во попаданий
             * </pre>
             *
             * <code>int32 shots_number = 3;</code>
             * @return The shotsNumber.
             */
            int getShotsNumber();

            /**
             * <pre>
             * Кол-во смертей
             * </pre>
             *
             * <code>int32 kills = 4;</code>
             * @return The kills.
             */
            int getKills();

            /**
             * <pre>
             * msec from start kit (internal clock)
             * </pre>
             *
             * <code>int32 kit_tick = 5;</code>
             * @return The kitTick.
             */
            int getKitTick();

            /**
             * <pre>
             * 0-no specifed, 1- body front, 2 - body back, 3 - left arm, 4 - right arm, 5 - head
             * </pre>
             *
             * <code>int32 damage_zone = 6;</code>
             * @return The damageZone.
             */
            int getDamageZone();

            /**
             * <pre>
             * number of shots no specefed zone
             * </pre>
             *
             * <code>uint32 shots_not_specified = 7;</code>
             * @return The shotsNotSpecified.
             */
            int getShotsNotSpecified();

            /**
             * <pre>
             * number of shots by body front zone
             * </pre>
             *
             * <code>uint32 shots_by_body_front_zone = 8;</code>
             * @return The shotsByBodyFrontZone.
             */
            int getShotsByBodyFrontZone();

            /**
             * <pre>
             * number of shots by body back zone
             * </pre>
             *
             * <code>uint32 shots_by_body_back_zone = 9;</code>
             * @return The shotsByBodyBackZone.
             */
            int getShotsByBodyBackZone();

            /**
             * <pre>
             * number of shots by left arm zone
             * </pre>
             *
             * <code>uint32 shots_by_left_arm_zone = 10;</code>
             * @return The shotsByLeftArmZone.
             */
            int getShotsByLeftArmZone();

            /**
             * <pre>
             * number of shots by right arm zone
             * </pre>
             *
             * <code>uint32 shots_by_right_arm_zone = 11;</code>
             * @return The shotsByRightArmZone.
             */
            int getShotsByRightArmZone();

            /**
             * <pre>
             * number of shots by head zone
             * </pre>
             *
             * <code>uint32 shots_by_head_zone = 12;</code>
             * @return The shotsByHeadZone.
             */
            int getShotsByHeadZone();

            /**
             * <pre>
             * damage by zone
             * </pre>
             *
             * <code>uint32 damage_not_specified = 13;</code>
             * @return The damageNotSpecified.
             */
            int getDamageNotSpecified();

            /**
             * <code>uint32 damage_by_body_front_zone = 14;</code>
             * @return The damageByBodyFrontZone.
             */
            int getDamageByBodyFrontZone();

            /**
             * <code>uint32 damage_by_body_back_zone = 15;</code>
             * @return The damageByBodyBackZone.
             */
            int getDamageByBodyBackZone();

            /**
             * <code>uint32 damage_by_left_arm_zone = 16;</code>
             * @return The damageByLeftArmZone.
             */
            int getDamageByLeftArmZone();

            /**
             * <code>uint32 damage_by_right_arm_zone = 17;</code>
             * @return The damageByRightArmZone.
             */
            int getDamageByRightArmZone();

            /**
             * <code>uint32 damage_by_head_zone = 18;</code>
             * @return The damageByHeadZone.
             */
            int getDamageByHeadZone();

            /**
             * <code>uint32 damage_by_tager_zone = 19;</code>
             * @return The damageByTagerZone.
             */
            int getDamageByTagerZone();

            /**
             * <code>uint32 shots_by_tager_zone = 20;</code>
             * @return The shotsByTagerZone.
             */
            int getShotsByTagerZone();
        }
        /**
         * <pre>
         *Запрос статистики кол-ва попаданий в устройство от сервера
         *Ответ устройства на запрос статистики кол-ва попаданий в устройство
         * </pre>
         *
         * Protobuf type {@code StatById}
         */
        public static final class StatById extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:StatById)
                StatByIdOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use StatById.newBuilder() to construct.
            private StatById(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private StatById() {
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new StatById();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private StatById(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            case 8: {

                                id_ = input.readInt32();
                                break;
                            }
                            case 16: {

                                damage_ = input.readInt32();
                                break;
                            }
                            case 24: {

                                shotsNumber_ = input.readInt32();
                                break;
                            }
                            case 32: {

                                kills_ = input.readInt32();
                                break;
                            }
                            case 40: {

                                kitTick_ = input.readInt32();
                                break;
                            }
                            case 48: {

                                damageZone_ = input.readInt32();
                                break;
                            }
                            case 56: {

                                shotsNotSpecified_ = input.readUInt32();
                                break;
                            }
                            case 64: {

                                shotsByBodyFrontZone_ = input.readUInt32();
                                break;
                            }
                            case 72: {

                                shotsByBodyBackZone_ = input.readUInt32();
                                break;
                            }
                            case 80: {

                                shotsByLeftArmZone_ = input.readUInt32();
                                break;
                            }
                            case 88: {

                                shotsByRightArmZone_ = input.readUInt32();
                                break;
                            }
                            case 96: {

                                shotsByHeadZone_ = input.readUInt32();
                                break;
                            }
                            case 104: {

                                damageNotSpecified_ = input.readUInt32();
                                break;
                            }
                            case 112: {

                                damageByBodyFrontZone_ = input.readUInt32();
                                break;
                            }
                            case 120: {

                                damageByBodyBackZone_ = input.readUInt32();
                                break;
                            }
                            case 128: {

                                damageByLeftArmZone_ = input.readUInt32();
                                break;
                            }
                            case 136: {

                                damageByRightArmZone_ = input.readUInt32();
                                break;
                            }
                            case 144: {

                                damageByHeadZone_ = input.readUInt32();
                                break;
                            }
                            case 152: {

                                damageByTagerZone_ = input.readUInt32();
                                break;
                            }
                            case 160: {

                                shotsByTagerZone_ = input.readUInt32();
                                break;
                            }
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_StatById_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_StatById_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                StatById.class, Builder.class);
            }

            public static final int ID_FIELD_NUMBER = 1;
            private int id_;
            /**
             * <pre>
             * Идентификационный номер комплекта
             * </pre>
             *
             * <code>int32 id = 1;</code>
             * @return The id.
             */
            @Override
            public int getId() {
                return id_;
            }

            public static final int DAMAGE_FIELD_NUMBER = 2;
            private int damage_;
            /**
             * <pre>
             * Кол-во полученного урона
             * </pre>
             *
             * <code>int32 damage = 2;</code>
             * @return The damage.
             */
            @Override
            public int getDamage() {
                return damage_;
            }

            public static final int SHOTS_NUMBER_FIELD_NUMBER = 3;
            private int shotsNumber_;
            /**
             * <pre>
             * Кол-во попаданий
             * </pre>
             *
             * <code>int32 shots_number = 3;</code>
             * @return The shotsNumber.
             */
            @Override
            public int getShotsNumber() {
                return shotsNumber_;
            }

            public static final int KILLS_FIELD_NUMBER = 4;
            private int kills_;
            /**
             * <pre>
             * Кол-во смертей
             * </pre>
             *
             * <code>int32 kills = 4;</code>
             * @return The kills.
             */
            @Override
            public int getKills() {
                return kills_;
            }

            public static final int KIT_TICK_FIELD_NUMBER = 5;
            private int kitTick_;
            /**
             * <pre>
             * msec from start kit (internal clock)
             * </pre>
             *
             * <code>int32 kit_tick = 5;</code>
             * @return The kitTick.
             */
            @Override
            public int getKitTick() {
                return kitTick_;
            }

            public static final int DAMAGE_ZONE_FIELD_NUMBER = 6;
            private int damageZone_;
            /**
             * <pre>
             * 0-no specifed, 1- body front, 2 - body back, 3 - left arm, 4 - right arm, 5 - head
             * </pre>
             *
             * <code>int32 damage_zone = 6;</code>
             * @return The damageZone.
             */
            @Override
            public int getDamageZone() {
                return damageZone_;
            }

            public static final int SHOTS_NOT_SPECIFIED_FIELD_NUMBER = 7;
            private int shotsNotSpecified_;
            /**
             * <pre>
             * number of shots no specefed zone
             * </pre>
             *
             * <code>uint32 shots_not_specified = 7;</code>
             * @return The shotsNotSpecified.
             */
            @Override
            public int getShotsNotSpecified() {
                return shotsNotSpecified_;
            }

            public static final int SHOTS_BY_BODY_FRONT_ZONE_FIELD_NUMBER = 8;
            private int shotsByBodyFrontZone_;
            /**
             * <pre>
             * number of shots by body front zone
             * </pre>
             *
             * <code>uint32 shots_by_body_front_zone = 8;</code>
             * @return The shotsByBodyFrontZone.
             */
            @Override
            public int getShotsByBodyFrontZone() {
                return shotsByBodyFrontZone_;
            }

            public static final int SHOTS_BY_BODY_BACK_ZONE_FIELD_NUMBER = 9;
            private int shotsByBodyBackZone_;
            /**
             * <pre>
             * number of shots by body back zone
             * </pre>
             *
             * <code>uint32 shots_by_body_back_zone = 9;</code>
             * @return The shotsByBodyBackZone.
             */
            @Override
            public int getShotsByBodyBackZone() {
                return shotsByBodyBackZone_;
            }

            public static final int SHOTS_BY_LEFT_ARM_ZONE_FIELD_NUMBER = 10;
            private int shotsByLeftArmZone_;
            /**
             * <pre>
             * number of shots by left arm zone
             * </pre>
             *
             * <code>uint32 shots_by_left_arm_zone = 10;</code>
             * @return The shotsByLeftArmZone.
             */
            @Override
            public int getShotsByLeftArmZone() {
                return shotsByLeftArmZone_;
            }

            public static final int SHOTS_BY_RIGHT_ARM_ZONE_FIELD_NUMBER = 11;
            private int shotsByRightArmZone_;
            /**
             * <pre>
             * number of shots by right arm zone
             * </pre>
             *
             * <code>uint32 shots_by_right_arm_zone = 11;</code>
             * @return The shotsByRightArmZone.
             */
            @Override
            public int getShotsByRightArmZone() {
                return shotsByRightArmZone_;
            }

            public static final int SHOTS_BY_HEAD_ZONE_FIELD_NUMBER = 12;
            private int shotsByHeadZone_;
            /**
             * <pre>
             * number of shots by head zone
             * </pre>
             *
             * <code>uint32 shots_by_head_zone = 12;</code>
             * @return The shotsByHeadZone.
             */
            @Override
            public int getShotsByHeadZone() {
                return shotsByHeadZone_;
            }

            public static final int DAMAGE_NOT_SPECIFIED_FIELD_NUMBER = 13;
            private int damageNotSpecified_;
            /**
             * <pre>
             * damage by zone
             * </pre>
             *
             * <code>uint32 damage_not_specified = 13;</code>
             * @return The damageNotSpecified.
             */
            @Override
            public int getDamageNotSpecified() {
                return damageNotSpecified_;
            }

            public static final int DAMAGE_BY_BODY_FRONT_ZONE_FIELD_NUMBER = 14;
            private int damageByBodyFrontZone_;
            /**
             * <code>uint32 damage_by_body_front_zone = 14;</code>
             * @return The damageByBodyFrontZone.
             */
            @Override
            public int getDamageByBodyFrontZone() {
                return damageByBodyFrontZone_;
            }

            public static final int DAMAGE_BY_BODY_BACK_ZONE_FIELD_NUMBER = 15;
            private int damageByBodyBackZone_;
            /**
             * <code>uint32 damage_by_body_back_zone = 15;</code>
             * @return The damageByBodyBackZone.
             */
            @Override
            public int getDamageByBodyBackZone() {
                return damageByBodyBackZone_;
            }

            public static final int DAMAGE_BY_LEFT_ARM_ZONE_FIELD_NUMBER = 16;
            private int damageByLeftArmZone_;
            /**
             * <code>uint32 damage_by_left_arm_zone = 16;</code>
             * @return The damageByLeftArmZone.
             */
            @Override
            public int getDamageByLeftArmZone() {
                return damageByLeftArmZone_;
            }

            public static final int DAMAGE_BY_RIGHT_ARM_ZONE_FIELD_NUMBER = 17;
            private int damageByRightArmZone_;
            /**
             * <code>uint32 damage_by_right_arm_zone = 17;</code>
             * @return The damageByRightArmZone.
             */
            @Override
            public int getDamageByRightArmZone() {
                return damageByRightArmZone_;
            }

            public static final int DAMAGE_BY_HEAD_ZONE_FIELD_NUMBER = 18;
            private int damageByHeadZone_;
            /**
             * <code>uint32 damage_by_head_zone = 18;</code>
             * @return The damageByHeadZone.
             */
            @Override
            public int getDamageByHeadZone() {
                return damageByHeadZone_;
            }

            public static final int DAMAGE_BY_TAGER_ZONE_FIELD_NUMBER = 19;
            private int damageByTagerZone_;
            /**
             * <code>uint32 damage_by_tager_zone = 19;</code>
             * @return The damageByTagerZone.
             */
            @Override
            public int getDamageByTagerZone() {
                return damageByTagerZone_;
            }

            public static final int SHOTS_BY_TAGER_ZONE_FIELD_NUMBER = 20;
            private int shotsByTagerZone_;
            /**
             * <code>uint32 shots_by_tager_zone = 20;</code>
             * @return The shotsByTagerZone.
             */
            @Override
            public int getShotsByTagerZone() {
                return shotsByTagerZone_;
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                if (id_ != 0) {
                    output.writeInt32(1, id_);
                }
                if (damage_ != 0) {
                    output.writeInt32(2, damage_);
                }
                if (shotsNumber_ != 0) {
                    output.writeInt32(3, shotsNumber_);
                }
                if (kills_ != 0) {
                    output.writeInt32(4, kills_);
                }
                if (kitTick_ != 0) {
                    output.writeInt32(5, kitTick_);
                }
                if (damageZone_ != 0) {
                    output.writeInt32(6, damageZone_);
                }
                if (shotsNotSpecified_ != 0) {
                    output.writeUInt32(7, shotsNotSpecified_);
                }
                if (shotsByBodyFrontZone_ != 0) {
                    output.writeUInt32(8, shotsByBodyFrontZone_);
                }
                if (shotsByBodyBackZone_ != 0) {
                    output.writeUInt32(9, shotsByBodyBackZone_);
                }
                if (shotsByLeftArmZone_ != 0) {
                    output.writeUInt32(10, shotsByLeftArmZone_);
                }
                if (shotsByRightArmZone_ != 0) {
                    output.writeUInt32(11, shotsByRightArmZone_);
                }
                if (shotsByHeadZone_ != 0) {
                    output.writeUInt32(12, shotsByHeadZone_);
                }
                if (damageNotSpecified_ != 0) {
                    output.writeUInt32(13, damageNotSpecified_);
                }
                if (damageByBodyFrontZone_ != 0) {
                    output.writeUInt32(14, damageByBodyFrontZone_);
                }
                if (damageByBodyBackZone_ != 0) {
                    output.writeUInt32(15, damageByBodyBackZone_);
                }
                if (damageByLeftArmZone_ != 0) {
                    output.writeUInt32(16, damageByLeftArmZone_);
                }
                if (damageByRightArmZone_ != 0) {
                    output.writeUInt32(17, damageByRightArmZone_);
                }
                if (damageByHeadZone_ != 0) {
                    output.writeUInt32(18, damageByHeadZone_);
                }
                if (damageByTagerZone_ != 0) {
                    output.writeUInt32(19, damageByTagerZone_);
                }
                if (shotsByTagerZone_ != 0) {
                    output.writeUInt32(20, shotsByTagerZone_);
                }
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                if (id_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(1, id_);
                }
                if (damage_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(2, damage_);
                }
                if (shotsNumber_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(3, shotsNumber_);
                }
                if (kills_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(4, kills_);
                }
                if (kitTick_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(5, kitTick_);
                }
                if (damageZone_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(6, damageZone_);
                }
                if (shotsNotSpecified_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeUInt32Size(7, shotsNotSpecified_);
                }
                if (shotsByBodyFrontZone_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeUInt32Size(8, shotsByBodyFrontZone_);
                }
                if (shotsByBodyBackZone_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeUInt32Size(9, shotsByBodyBackZone_);
                }
                if (shotsByLeftArmZone_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeUInt32Size(10, shotsByLeftArmZone_);
                }
                if (shotsByRightArmZone_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeUInt32Size(11, shotsByRightArmZone_);
                }
                if (shotsByHeadZone_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeUInt32Size(12, shotsByHeadZone_);
                }
                if (damageNotSpecified_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeUInt32Size(13, damageNotSpecified_);
                }
                if (damageByBodyFrontZone_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeUInt32Size(14, damageByBodyFrontZone_);
                }
                if (damageByBodyBackZone_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeUInt32Size(15, damageByBodyBackZone_);
                }
                if (damageByLeftArmZone_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeUInt32Size(16, damageByLeftArmZone_);
                }
                if (damageByRightArmZone_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeUInt32Size(17, damageByRightArmZone_);
                }
                if (damageByHeadZone_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeUInt32Size(18, damageByHeadZone_);
                }
                if (damageByTagerZone_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeUInt32Size(19, damageByTagerZone_);
                }
                if (shotsByTagerZone_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeUInt32Size(20, shotsByTagerZone_);
                }
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof StatById)) {
                    return super.equals(obj);
                }
                StatById other = (StatById) obj;

                if (getId()
                        != other.getId()) return false;
                if (getDamage()
                        != other.getDamage()) return false;
                if (getShotsNumber()
                        != other.getShotsNumber()) return false;
                if (getKills()
                        != other.getKills()) return false;
                if (getKitTick()
                        != other.getKitTick()) return false;
                if (getDamageZone()
                        != other.getDamageZone()) return false;
                if (getShotsNotSpecified()
                        != other.getShotsNotSpecified()) return false;
                if (getShotsByBodyFrontZone()
                        != other.getShotsByBodyFrontZone()) return false;
                if (getShotsByBodyBackZone()
                        != other.getShotsByBodyBackZone()) return false;
                if (getShotsByLeftArmZone()
                        != other.getShotsByLeftArmZone()) return false;
                if (getShotsByRightArmZone()
                        != other.getShotsByRightArmZone()) return false;
                if (getShotsByHeadZone()
                        != other.getShotsByHeadZone()) return false;
                if (getDamageNotSpecified()
                        != other.getDamageNotSpecified()) return false;
                if (getDamageByBodyFrontZone()
                        != other.getDamageByBodyFrontZone()) return false;
                if (getDamageByBodyBackZone()
                        != other.getDamageByBodyBackZone()) return false;
                if (getDamageByLeftArmZone()
                        != other.getDamageByLeftArmZone()) return false;
                if (getDamageByRightArmZone()
                        != other.getDamageByRightArmZone()) return false;
                if (getDamageByHeadZone()
                        != other.getDamageByHeadZone()) return false;
                if (getDamageByTagerZone()
                        != other.getDamageByTagerZone()) return false;
                if (getShotsByTagerZone()
                        != other.getShotsByTagerZone()) return false;
                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                hash = (37 * hash) + ID_FIELD_NUMBER;
                hash = (53 * hash) + getId();
                hash = (37 * hash) + DAMAGE_FIELD_NUMBER;
                hash = (53 * hash) + getDamage();
                hash = (37 * hash) + SHOTS_NUMBER_FIELD_NUMBER;
                hash = (53 * hash) + getShotsNumber();
                hash = (37 * hash) + KILLS_FIELD_NUMBER;
                hash = (53 * hash) + getKills();
                hash = (37 * hash) + KIT_TICK_FIELD_NUMBER;
                hash = (53 * hash) + getKitTick();
                hash = (37 * hash) + DAMAGE_ZONE_FIELD_NUMBER;
                hash = (53 * hash) + getDamageZone();
                hash = (37 * hash) + SHOTS_NOT_SPECIFIED_FIELD_NUMBER;
                hash = (53 * hash) + getShotsNotSpecified();
                hash = (37 * hash) + SHOTS_BY_BODY_FRONT_ZONE_FIELD_NUMBER;
                hash = (53 * hash) + getShotsByBodyFrontZone();
                hash = (37 * hash) + SHOTS_BY_BODY_BACK_ZONE_FIELD_NUMBER;
                hash = (53 * hash) + getShotsByBodyBackZone();
                hash = (37 * hash) + SHOTS_BY_LEFT_ARM_ZONE_FIELD_NUMBER;
                hash = (53 * hash) + getShotsByLeftArmZone();
                hash = (37 * hash) + SHOTS_BY_RIGHT_ARM_ZONE_FIELD_NUMBER;
                hash = (53 * hash) + getShotsByRightArmZone();
                hash = (37 * hash) + SHOTS_BY_HEAD_ZONE_FIELD_NUMBER;
                hash = (53 * hash) + getShotsByHeadZone();
                hash = (37 * hash) + DAMAGE_NOT_SPECIFIED_FIELD_NUMBER;
                hash = (53 * hash) + getDamageNotSpecified();
                hash = (37 * hash) + DAMAGE_BY_BODY_FRONT_ZONE_FIELD_NUMBER;
                hash = (53 * hash) + getDamageByBodyFrontZone();
                hash = (37 * hash) + DAMAGE_BY_BODY_BACK_ZONE_FIELD_NUMBER;
                hash = (53 * hash) + getDamageByBodyBackZone();
                hash = (37 * hash) + DAMAGE_BY_LEFT_ARM_ZONE_FIELD_NUMBER;
                hash = (53 * hash) + getDamageByLeftArmZone();
                hash = (37 * hash) + DAMAGE_BY_RIGHT_ARM_ZONE_FIELD_NUMBER;
                hash = (53 * hash) + getDamageByRightArmZone();
                hash = (37 * hash) + DAMAGE_BY_HEAD_ZONE_FIELD_NUMBER;
                hash = (53 * hash) + getDamageByHeadZone();
                hash = (37 * hash) + DAMAGE_BY_TAGER_ZONE_FIELD_NUMBER;
                hash = (53 * hash) + getDamageByTagerZone();
                hash = (37 * hash) + SHOTS_BY_TAGER_ZONE_FIELD_NUMBER;
                hash = (53 * hash) + getShotsByTagerZone();
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static StatById parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static StatById parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static StatById parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static StatById parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static StatById parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static StatById parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static StatById parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static StatById parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static StatById parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static StatById parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static StatById parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static StatById parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(StatById prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * <pre>
             *Запрос статистики кол-ва попаданий в устройство от сервера
             *Ответ устройства на запрос статистики кол-ва попаданий в устройство
             * </pre>
             *
             * Protobuf type {@code StatById}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:StatById)
                    StatByIdOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_StatById_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_StatById_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    StatById.class, Builder.class);
                }

                // Construct using ForpostServer.StatById.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    id_ = 0;

                    damage_ = 0;

                    shotsNumber_ = 0;

                    kills_ = 0;

                    kitTick_ = 0;

                    damageZone_ = 0;

                    shotsNotSpecified_ = 0;

                    shotsByBodyFrontZone_ = 0;

                    shotsByBodyBackZone_ = 0;

                    shotsByLeftArmZone_ = 0;

                    shotsByRightArmZone_ = 0;

                    shotsByHeadZone_ = 0;

                    damageNotSpecified_ = 0;

                    damageByBodyFrontZone_ = 0;

                    damageByBodyBackZone_ = 0;

                    damageByLeftArmZone_ = 0;

                    damageByRightArmZone_ = 0;

                    damageByHeadZone_ = 0;

                    damageByTagerZone_ = 0;

                    shotsByTagerZone_ = 0;

                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_StatById_descriptor;
                }

                @Override
                public StatById getDefaultInstanceForType() {
                    return StatById.getDefaultInstance();
                }

                @Override
                public StatById build() {
                    StatById result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public StatById buildPartial() {
                    StatById result = new StatById(this);
                    result.id_ = id_;
                    result.damage_ = damage_;
                    result.shotsNumber_ = shotsNumber_;
                    result.kills_ = kills_;
                    result.kitTick_ = kitTick_;
                    result.damageZone_ = damageZone_;
                    result.shotsNotSpecified_ = shotsNotSpecified_;
                    result.shotsByBodyFrontZone_ = shotsByBodyFrontZone_;
                    result.shotsByBodyBackZone_ = shotsByBodyBackZone_;
                    result.shotsByLeftArmZone_ = shotsByLeftArmZone_;
                    result.shotsByRightArmZone_ = shotsByRightArmZone_;
                    result.shotsByHeadZone_ = shotsByHeadZone_;
                    result.damageNotSpecified_ = damageNotSpecified_;
                    result.damageByBodyFrontZone_ = damageByBodyFrontZone_;
                    result.damageByBodyBackZone_ = damageByBodyBackZone_;
                    result.damageByLeftArmZone_ = damageByLeftArmZone_;
                    result.damageByRightArmZone_ = damageByRightArmZone_;
                    result.damageByHeadZone_ = damageByHeadZone_;
                    result.damageByTagerZone_ = damageByTagerZone_;
                    result.shotsByTagerZone_ = shotsByTagerZone_;
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof StatById) {
                        return mergeFrom((StatById)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(StatById other) {
                    if (other == StatById.getDefaultInstance()) return this;
                    if (other.getId() != 0) {
                        setId(other.getId());
                    }
                    if (other.getDamage() != 0) {
                        setDamage(other.getDamage());
                    }
                    if (other.getShotsNumber() != 0) {
                        setShotsNumber(other.getShotsNumber());
                    }
                    if (other.getKills() != 0) {
                        setKills(other.getKills());
                    }
                    if (other.getKitTick() != 0) {
                        setKitTick(other.getKitTick());
                    }
                    if (other.getDamageZone() != 0) {
                        setDamageZone(other.getDamageZone());
                    }
                    if (other.getShotsNotSpecified() != 0) {
                        setShotsNotSpecified(other.getShotsNotSpecified());
                    }
                    if (other.getShotsByBodyFrontZone() != 0) {
                        setShotsByBodyFrontZone(other.getShotsByBodyFrontZone());
                    }
                    if (other.getShotsByBodyBackZone() != 0) {
                        setShotsByBodyBackZone(other.getShotsByBodyBackZone());
                    }
                    if (other.getShotsByLeftArmZone() != 0) {
                        setShotsByLeftArmZone(other.getShotsByLeftArmZone());
                    }
                    if (other.getShotsByRightArmZone() != 0) {
                        setShotsByRightArmZone(other.getShotsByRightArmZone());
                    }
                    if (other.getShotsByHeadZone() != 0) {
                        setShotsByHeadZone(other.getShotsByHeadZone());
                    }
                    if (other.getDamageNotSpecified() != 0) {
                        setDamageNotSpecified(other.getDamageNotSpecified());
                    }
                    if (other.getDamageByBodyFrontZone() != 0) {
                        setDamageByBodyFrontZone(other.getDamageByBodyFrontZone());
                    }
                    if (other.getDamageByBodyBackZone() != 0) {
                        setDamageByBodyBackZone(other.getDamageByBodyBackZone());
                    }
                    if (other.getDamageByLeftArmZone() != 0) {
                        setDamageByLeftArmZone(other.getDamageByLeftArmZone());
                    }
                    if (other.getDamageByRightArmZone() != 0) {
                        setDamageByRightArmZone(other.getDamageByRightArmZone());
                    }
                    if (other.getDamageByHeadZone() != 0) {
                        setDamageByHeadZone(other.getDamageByHeadZone());
                    }
                    if (other.getDamageByTagerZone() != 0) {
                        setDamageByTagerZone(other.getDamageByTagerZone());
                    }
                    if (other.getShotsByTagerZone() != 0) {
                        setShotsByTagerZone(other.getShotsByTagerZone());
                    }
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    StatById parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (StatById) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }

                private int id_ ;
                /**
                 * <pre>
                 * Идентификационный номер комплекта
                 * </pre>
                 *
                 * <code>int32 id = 1;</code>
                 * @return The id.
                 */
                @Override
                public int getId() {
                    return id_;
                }
                /**
                 * <pre>
                 * Идентификационный номер комплекта
                 * </pre>
                 *
                 * <code>int32 id = 1;</code>
                 * @param value The id to set.
                 * @return This builder for chaining.
                 */
                public Builder setId(int value) {

                    id_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * Идентификационный номер комплекта
                 * </pre>
                 *
                 * <code>int32 id = 1;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearId() {

                    id_ = 0;
                    onChanged();
                    return this;
                }

                private int damage_ ;
                /**
                 * <pre>
                 * Кол-во полученного урона
                 * </pre>
                 *
                 * <code>int32 damage = 2;</code>
                 * @return The damage.
                 */
                @Override
                public int getDamage() {
                    return damage_;
                }
                /**
                 * <pre>
                 * Кол-во полученного урона
                 * </pre>
                 *
                 * <code>int32 damage = 2;</code>
                 * @param value The damage to set.
                 * @return This builder for chaining.
                 */
                public Builder setDamage(int value) {

                    damage_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * Кол-во полученного урона
                 * </pre>
                 *
                 * <code>int32 damage = 2;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearDamage() {

                    damage_ = 0;
                    onChanged();
                    return this;
                }

                private int shotsNumber_ ;
                /**
                 * <pre>
                 * Кол-во попаданий
                 * </pre>
                 *
                 * <code>int32 shots_number = 3;</code>
                 * @return The shotsNumber.
                 */
                @Override
                public int getShotsNumber() {
                    return shotsNumber_;
                }
                /**
                 * <pre>
                 * Кол-во попаданий
                 * </pre>
                 *
                 * <code>int32 shots_number = 3;</code>
                 * @param value The shotsNumber to set.
                 * @return This builder for chaining.
                 */
                public Builder setShotsNumber(int value) {

                    shotsNumber_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * Кол-во попаданий
                 * </pre>
                 *
                 * <code>int32 shots_number = 3;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearShotsNumber() {

                    shotsNumber_ = 0;
                    onChanged();
                    return this;
                }

                private int kills_ ;
                /**
                 * <pre>
                 * Кол-во смертей
                 * </pre>
                 *
                 * <code>int32 kills = 4;</code>
                 * @return The kills.
                 */
                @Override
                public int getKills() {
                    return kills_;
                }
                /**
                 * <pre>
                 * Кол-во смертей
                 * </pre>
                 *
                 * <code>int32 kills = 4;</code>
                 * @param value The kills to set.
                 * @return This builder for chaining.
                 */
                public Builder setKills(int value) {

                    kills_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * Кол-во смертей
                 * </pre>
                 *
                 * <code>int32 kills = 4;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearKills() {

                    kills_ = 0;
                    onChanged();
                    return this;
                }

                private int kitTick_ ;
                /**
                 * <pre>
                 * msec from start kit (internal clock)
                 * </pre>
                 *
                 * <code>int32 kit_tick = 5;</code>
                 * @return The kitTick.
                 */
                @Override
                public int getKitTick() {
                    return kitTick_;
                }
                /**
                 * <pre>
                 * msec from start kit (internal clock)
                 * </pre>
                 *
                 * <code>int32 kit_tick = 5;</code>
                 * @param value The kitTick to set.
                 * @return This builder for chaining.
                 */
                public Builder setKitTick(int value) {

                    kitTick_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * msec from start kit (internal clock)
                 * </pre>
                 *
                 * <code>int32 kit_tick = 5;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearKitTick() {

                    kitTick_ = 0;
                    onChanged();
                    return this;
                }

                private int damageZone_ ;
                /**
                 * <pre>
                 * 0-no specifed, 1- body front, 2 - body back, 3 - left arm, 4 - right arm, 5 - head
                 * </pre>
                 *
                 * <code>int32 damage_zone = 6;</code>
                 * @return The damageZone.
                 */
                @Override
                public int getDamageZone() {
                    return damageZone_;
                }
                /**
                 * <pre>
                 * 0-no specifed, 1- body front, 2 - body back, 3 - left arm, 4 - right arm, 5 - head
                 * </pre>
                 *
                 * <code>int32 damage_zone = 6;</code>
                 * @param value The damageZone to set.
                 * @return This builder for chaining.
                 */
                public Builder setDamageZone(int value) {

                    damageZone_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * 0-no specifed, 1- body front, 2 - body back, 3 - left arm, 4 - right arm, 5 - head
                 * </pre>
                 *
                 * <code>int32 damage_zone = 6;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearDamageZone() {

                    damageZone_ = 0;
                    onChanged();
                    return this;
                }

                private int shotsNotSpecified_ ;
                /**
                 * <pre>
                 * number of shots no specefed zone
                 * </pre>
                 *
                 * <code>uint32 shots_not_specified = 7;</code>
                 * @return The shotsNotSpecified.
                 */
                @Override
                public int getShotsNotSpecified() {
                    return shotsNotSpecified_;
                }
                /**
                 * <pre>
                 * number of shots no specefed zone
                 * </pre>
                 *
                 * <code>uint32 shots_not_specified = 7;</code>
                 * @param value The shotsNotSpecified to set.
                 * @return This builder for chaining.
                 */
                public Builder setShotsNotSpecified(int value) {

                    shotsNotSpecified_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * number of shots no specefed zone
                 * </pre>
                 *
                 * <code>uint32 shots_not_specified = 7;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearShotsNotSpecified() {

                    shotsNotSpecified_ = 0;
                    onChanged();
                    return this;
                }

                private int shotsByBodyFrontZone_ ;
                /**
                 * <pre>
                 * number of shots by body front zone
                 * </pre>
                 *
                 * <code>uint32 shots_by_body_front_zone = 8;</code>
                 * @return The shotsByBodyFrontZone.
                 */
                @Override
                public int getShotsByBodyFrontZone() {
                    return shotsByBodyFrontZone_;
                }
                /**
                 * <pre>
                 * number of shots by body front zone
                 * </pre>
                 *
                 * <code>uint32 shots_by_body_front_zone = 8;</code>
                 * @param value The shotsByBodyFrontZone to set.
                 * @return This builder for chaining.
                 */
                public Builder setShotsByBodyFrontZone(int value) {

                    shotsByBodyFrontZone_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * number of shots by body front zone
                 * </pre>
                 *
                 * <code>uint32 shots_by_body_front_zone = 8;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearShotsByBodyFrontZone() {

                    shotsByBodyFrontZone_ = 0;
                    onChanged();
                    return this;
                }

                private int shotsByBodyBackZone_ ;
                /**
                 * <pre>
                 * number of shots by body back zone
                 * </pre>
                 *
                 * <code>uint32 shots_by_body_back_zone = 9;</code>
                 * @return The shotsByBodyBackZone.
                 */
                @Override
                public int getShotsByBodyBackZone() {
                    return shotsByBodyBackZone_;
                }
                /**
                 * <pre>
                 * number of shots by body back zone
                 * </pre>
                 *
                 * <code>uint32 shots_by_body_back_zone = 9;</code>
                 * @param value The shotsByBodyBackZone to set.
                 * @return This builder for chaining.
                 */
                public Builder setShotsByBodyBackZone(int value) {

                    shotsByBodyBackZone_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * number of shots by body back zone
                 * </pre>
                 *
                 * <code>uint32 shots_by_body_back_zone = 9;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearShotsByBodyBackZone() {

                    shotsByBodyBackZone_ = 0;
                    onChanged();
                    return this;
                }

                private int shotsByLeftArmZone_ ;
                /**
                 * <pre>
                 * number of shots by left arm zone
                 * </pre>
                 *
                 * <code>uint32 shots_by_left_arm_zone = 10;</code>
                 * @return The shotsByLeftArmZone.
                 */
                @Override
                public int getShotsByLeftArmZone() {
                    return shotsByLeftArmZone_;
                }
                /**
                 * <pre>
                 * number of shots by left arm zone
                 * </pre>
                 *
                 * <code>uint32 shots_by_left_arm_zone = 10;</code>
                 * @param value The shotsByLeftArmZone to set.
                 * @return This builder for chaining.
                 */
                public Builder setShotsByLeftArmZone(int value) {

                    shotsByLeftArmZone_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * number of shots by left arm zone
                 * </pre>
                 *
                 * <code>uint32 shots_by_left_arm_zone = 10;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearShotsByLeftArmZone() {

                    shotsByLeftArmZone_ = 0;
                    onChanged();
                    return this;
                }

                private int shotsByRightArmZone_ ;
                /**
                 * <pre>
                 * number of shots by right arm zone
                 * </pre>
                 *
                 * <code>uint32 shots_by_right_arm_zone = 11;</code>
                 * @return The shotsByRightArmZone.
                 */
                @Override
                public int getShotsByRightArmZone() {
                    return shotsByRightArmZone_;
                }
                /**
                 * <pre>
                 * number of shots by right arm zone
                 * </pre>
                 *
                 * <code>uint32 shots_by_right_arm_zone = 11;</code>
                 * @param value The shotsByRightArmZone to set.
                 * @return This builder for chaining.
                 */
                public Builder setShotsByRightArmZone(int value) {

                    shotsByRightArmZone_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * number of shots by right arm zone
                 * </pre>
                 *
                 * <code>uint32 shots_by_right_arm_zone = 11;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearShotsByRightArmZone() {

                    shotsByRightArmZone_ = 0;
                    onChanged();
                    return this;
                }

                private int shotsByHeadZone_ ;
                /**
                 * <pre>
                 * number of shots by head zone
                 * </pre>
                 *
                 * <code>uint32 shots_by_head_zone = 12;</code>
                 * @return The shotsByHeadZone.
                 */
                @Override
                public int getShotsByHeadZone() {
                    return shotsByHeadZone_;
                }
                /**
                 * <pre>
                 * number of shots by head zone
                 * </pre>
                 *
                 * <code>uint32 shots_by_head_zone = 12;</code>
                 * @param value The shotsByHeadZone to set.
                 * @return This builder for chaining.
                 */
                public Builder setShotsByHeadZone(int value) {

                    shotsByHeadZone_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * number of shots by head zone
                 * </pre>
                 *
                 * <code>uint32 shots_by_head_zone = 12;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearShotsByHeadZone() {

                    shotsByHeadZone_ = 0;
                    onChanged();
                    return this;
                }

                private int damageNotSpecified_ ;
                /**
                 * <pre>
                 * damage by zone
                 * </pre>
                 *
                 * <code>uint32 damage_not_specified = 13;</code>
                 * @return The damageNotSpecified.
                 */
                @Override
                public int getDamageNotSpecified() {
                    return damageNotSpecified_;
                }
                /**
                 * <pre>
                 * damage by zone
                 * </pre>
                 *
                 * <code>uint32 damage_not_specified = 13;</code>
                 * @param value The damageNotSpecified to set.
                 * @return This builder for chaining.
                 */
                public Builder setDamageNotSpecified(int value) {

                    damageNotSpecified_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * damage by zone
                 * </pre>
                 *
                 * <code>uint32 damage_not_specified = 13;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearDamageNotSpecified() {

                    damageNotSpecified_ = 0;
                    onChanged();
                    return this;
                }

                private int damageByBodyFrontZone_ ;
                /**
                 * <code>uint32 damage_by_body_front_zone = 14;</code>
                 * @return The damageByBodyFrontZone.
                 */
                @Override
                public int getDamageByBodyFrontZone() {
                    return damageByBodyFrontZone_;
                }
                /**
                 * <code>uint32 damage_by_body_front_zone = 14;</code>
                 * @param value The damageByBodyFrontZone to set.
                 * @return This builder for chaining.
                 */
                public Builder setDamageByBodyFrontZone(int value) {

                    damageByBodyFrontZone_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>uint32 damage_by_body_front_zone = 14;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearDamageByBodyFrontZone() {

                    damageByBodyFrontZone_ = 0;
                    onChanged();
                    return this;
                }

                private int damageByBodyBackZone_ ;
                /**
                 * <code>uint32 damage_by_body_back_zone = 15;</code>
                 * @return The damageByBodyBackZone.
                 */
                @Override
                public int getDamageByBodyBackZone() {
                    return damageByBodyBackZone_;
                }
                /**
                 * <code>uint32 damage_by_body_back_zone = 15;</code>
                 * @param value The damageByBodyBackZone to set.
                 * @return This builder for chaining.
                 */
                public Builder setDamageByBodyBackZone(int value) {

                    damageByBodyBackZone_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>uint32 damage_by_body_back_zone = 15;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearDamageByBodyBackZone() {

                    damageByBodyBackZone_ = 0;
                    onChanged();
                    return this;
                }

                private int damageByLeftArmZone_ ;
                /**
                 * <code>uint32 damage_by_left_arm_zone = 16;</code>
                 * @return The damageByLeftArmZone.
                 */
                @Override
                public int getDamageByLeftArmZone() {
                    return damageByLeftArmZone_;
                }
                /**
                 * <code>uint32 damage_by_left_arm_zone = 16;</code>
                 * @param value The damageByLeftArmZone to set.
                 * @return This builder for chaining.
                 */
                public Builder setDamageByLeftArmZone(int value) {

                    damageByLeftArmZone_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>uint32 damage_by_left_arm_zone = 16;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearDamageByLeftArmZone() {

                    damageByLeftArmZone_ = 0;
                    onChanged();
                    return this;
                }

                private int damageByRightArmZone_ ;
                /**
                 * <code>uint32 damage_by_right_arm_zone = 17;</code>
                 * @return The damageByRightArmZone.
                 */
                @Override
                public int getDamageByRightArmZone() {
                    return damageByRightArmZone_;
                }
                /**
                 * <code>uint32 damage_by_right_arm_zone = 17;</code>
                 * @param value The damageByRightArmZone to set.
                 * @return This builder for chaining.
                 */
                public Builder setDamageByRightArmZone(int value) {

                    damageByRightArmZone_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>uint32 damage_by_right_arm_zone = 17;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearDamageByRightArmZone() {

                    damageByRightArmZone_ = 0;
                    onChanged();
                    return this;
                }

                private int damageByHeadZone_ ;
                /**
                 * <code>uint32 damage_by_head_zone = 18;</code>
                 * @return The damageByHeadZone.
                 */
                @Override
                public int getDamageByHeadZone() {
                    return damageByHeadZone_;
                }
                /**
                 * <code>uint32 damage_by_head_zone = 18;</code>
                 * @param value The damageByHeadZone to set.
                 * @return This builder for chaining.
                 */
                public Builder setDamageByHeadZone(int value) {

                    damageByHeadZone_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>uint32 damage_by_head_zone = 18;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearDamageByHeadZone() {

                    damageByHeadZone_ = 0;
                    onChanged();
                    return this;
                }

                private int damageByTagerZone_ ;
                /**
                 * <code>uint32 damage_by_tager_zone = 19;</code>
                 * @return The damageByTagerZone.
                 */
                @Override
                public int getDamageByTagerZone() {
                    return damageByTagerZone_;
                }
                /**
                 * <code>uint32 damage_by_tager_zone = 19;</code>
                 * @param value The damageByTagerZone to set.
                 * @return This builder for chaining.
                 */
                public Builder setDamageByTagerZone(int value) {

                    damageByTagerZone_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>uint32 damage_by_tager_zone = 19;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearDamageByTagerZone() {

                    damageByTagerZone_ = 0;
                    onChanged();
                    return this;
                }

                private int shotsByTagerZone_ ;
                /**
                 * <code>uint32 shots_by_tager_zone = 20;</code>
                 * @return The shotsByTagerZone.
                 */
                @Override
                public int getShotsByTagerZone() {
                    return shotsByTagerZone_;
                }
                /**
                 * <code>uint32 shots_by_tager_zone = 20;</code>
                 * @param value The shotsByTagerZone to set.
                 * @return This builder for chaining.
                 */
                public Builder setShotsByTagerZone(int value) {

                    shotsByTagerZone_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>uint32 shots_by_tager_zone = 20;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearShotsByTagerZone() {

                    shotsByTagerZone_ = 0;
                    onChanged();
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:StatById)
            }

            // @@protoc_insertion_point(class_scope:StatById)
            private static final StatById DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new StatById();
            }

            public static StatById getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<StatById>
                    PARSER = new com.google.protobuf.AbstractParser<StatById>() {
                @Override
                public StatById parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new StatById(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<StatById> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<StatById> getParserForType() {
                return PARSER;
            }

            @Override
            public StatById getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface StartGameOrBuilder extends
                // @@protoc_insertion_point(interface_extends:StartGame)
                com.google.protobuf.MessageOrBuilder {

            /**
             * <pre>
             * Запуск устройства в беззвучном режиме
             * </pre>
             *
             * <code>bool silent = 1;</code>
             * @return The silent.
             */
            boolean getSilent();

            /**
             * <pre>
             * id current game
             * </pre>
             *
             * <code>uint32 game_id = 2;</code>
             * @return The gameId.
             */
            int getGameId();
        }
        /**
         * <pre>
         * Команда запуска в игру
         * </pre>
         *
         * Protobuf type {@code StartGame}
         */
        public static final class StartGame extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:StartGame)
                StartGameOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use StartGame.newBuilder() to construct.
            private StartGame(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private StartGame() {
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new StartGame();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private StartGame(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            case 8: {

                                silent_ = input.readBool();
                                break;
                            }
                            case 16: {

                                gameId_ = input.readUInt32();
                                break;
                            }
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_StartGame_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_StartGame_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                StartGame.class, Builder.class);
            }

            public static final int SILENT_FIELD_NUMBER = 1;
            private boolean silent_;
            /**
             * <pre>
             * Запуск устройства в беззвучном режиме
             * </pre>
             *
             * <code>bool silent = 1;</code>
             * @return The silent.
             */
            @Override
            public boolean getSilent() {
                return silent_;
            }

            public static final int GAME_ID_FIELD_NUMBER = 2;
            private int gameId_;
            /**
             * <pre>
             * id current game
             * </pre>
             *
             * <code>uint32 game_id = 2;</code>
             * @return The gameId.
             */
            @Override
            public int getGameId() {
                return gameId_;
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                if (silent_ != false) {
                    output.writeBool(1, silent_);
                }
                if (gameId_ != 0) {
                    output.writeUInt32(2, gameId_);
                }
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                if (silent_ != false) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBoolSize(1, silent_);
                }
                if (gameId_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeUInt32Size(2, gameId_);
                }
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof StartGame)) {
                    return super.equals(obj);
                }
                StartGame other = (StartGame) obj;

                if (getSilent()
                        != other.getSilent()) return false;
                if (getGameId()
                        != other.getGameId()) return false;
                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                hash = (37 * hash) + SILENT_FIELD_NUMBER;
                hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
                        getSilent());
                hash = (37 * hash) + GAME_ID_FIELD_NUMBER;
                hash = (53 * hash) + getGameId();
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static StartGame parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static StartGame parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static StartGame parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static StartGame parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static StartGame parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static StartGame parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static StartGame parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static StartGame parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static StartGame parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static StartGame parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static StartGame parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static StartGame parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(StartGame prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * <pre>
             * Команда запуска в игру
             * </pre>
             *
             * Protobuf type {@code StartGame}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:StartGame)
                    StartGameOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_StartGame_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_StartGame_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    StartGame.class, Builder.class);
                }

                // Construct using ForpostServer.StartGame.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    silent_ = false;

                    gameId_ = 0;

                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_StartGame_descriptor;
                }

                @Override
                public StartGame getDefaultInstanceForType() {
                    return StartGame.getDefaultInstance();
                }

                @Override
                public StartGame build() {
                    StartGame result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public StartGame buildPartial() {
                    StartGame result = new StartGame(this);
                    result.silent_ = silent_;
                    result.gameId_ = gameId_;
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof StartGame) {
                        return mergeFrom((StartGame)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(StartGame other) {
                    if (other == StartGame.getDefaultInstance()) return this;
                    if (other.getSilent() != false) {
                        setSilent(other.getSilent());
                    }
                    if (other.getGameId() != 0) {
                        setGameId(other.getGameId());
                    }
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    StartGame parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (StartGame) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }

                private boolean silent_ ;
                /**
                 * <pre>
                 * Запуск устройства в беззвучном режиме
                 * </pre>
                 *
                 * <code>bool silent = 1;</code>
                 * @return The silent.
                 */
                @Override
                public boolean getSilent() {
                    return silent_;
                }
                /**
                 * <pre>
                 * Запуск устройства в беззвучном режиме
                 * </pre>
                 *
                 * <code>bool silent = 1;</code>
                 * @param value The silent to set.
                 * @return This builder for chaining.
                 */
                public Builder setSilent(boolean value) {

                    silent_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * Запуск устройства в беззвучном режиме
                 * </pre>
                 *
                 * <code>bool silent = 1;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearSilent() {

                    silent_ = false;
                    onChanged();
                    return this;
                }

                private int gameId_ ;
                /**
                 * <pre>
                 * id current game
                 * </pre>
                 *
                 * <code>uint32 game_id = 2;</code>
                 * @return The gameId.
                 */
                @Override
                public int getGameId() {
                    return gameId_;
                }
                /**
                 * <pre>
                 * id current game
                 * </pre>
                 *
                 * <code>uint32 game_id = 2;</code>
                 * @param value The gameId to set.
                 * @return This builder for chaining.
                 */
                public Builder setGameId(int value) {

                    gameId_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * id current game
                 * </pre>
                 *
                 * <code>uint32 game_id = 2;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearGameId() {

                    gameId_ = 0;
                    onChanged();
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:StartGame)
            }

            // @@protoc_insertion_point(class_scope:StartGame)
            private static final StartGame DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new StartGame();
            }

            public static StartGame getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<StartGame>
                    PARSER = new com.google.protobuf.AbstractParser<StartGame>() {
                @Override
                public StartGame parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new StartGame(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<StartGame> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<StartGame> getParserForType() {
                return PARSER;
            }

            @Override
            public StartGame getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface StopGameOrBuilder extends
                // @@protoc_insertion_point(interface_extends:StopGame)
                com.google.protobuf.MessageOrBuilder {
        }
        /**
         * <pre>
         * Команда остановки игры
         * </pre>
         *
         * Protobuf type {@code StopGame}
         */
        public static final class StopGame extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:StopGame)
                StopGameOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use StopGame.newBuilder() to construct.
            private StopGame(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private StopGame() {
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new StopGame();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private StopGame(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_StopGame_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_StopGame_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                StopGame.class, Builder.class);
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof StopGame)) {
                    return super.equals(obj);
                }
                StopGame other = (StopGame) obj;

                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static StopGame parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static StopGame parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static StopGame parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static StopGame parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static StopGame parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static StopGame parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static StopGame parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static StopGame parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static StopGame parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static StopGame parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static StopGame parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static StopGame parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(StopGame prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * <pre>
             * Команда остановки игры
             * </pre>
             *
             * Protobuf type {@code StopGame}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:StopGame)
                    StopGameOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_StopGame_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_StopGame_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    StopGame.class, Builder.class);
                }

                // Construct using ForpostServer.StopGame.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_StopGame_descriptor;
                }

                @Override
                public StopGame getDefaultInstanceForType() {
                    return StopGame.getDefaultInstance();
                }

                @Override
                public StopGame build() {
                    StopGame result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public StopGame buildPartial() {
                    StopGame result = new StopGame(this);
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof StopGame) {
                        return mergeFrom((StopGame)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(StopGame other) {
                    if (other == StopGame.getDefaultInstance()) return this;
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    StopGame parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (StopGame) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:StopGame)
            }

            // @@protoc_insertion_point(class_scope:StopGame)
            private static final StopGame DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new StopGame();
            }

            public static StopGame getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<StopGame>
                    PARSER = new com.google.protobuf.AbstractParser<StopGame>() {
                @Override
                public StopGame parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new StopGame(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<StopGame> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<StopGame> getParserForType() {
                return PARSER;
            }

            @Override
            public StopGame getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface PauseGameOrBuilder extends
                // @@protoc_insertion_point(interface_extends:PauseGame)
                com.google.protobuf.MessageOrBuilder {
        }
        /**
         * <pre>
         * Постановка игры на паузу. Применится, если устройство в игровом состоянии
         * </pre>
         *
         * Protobuf type {@code PauseGame}
         */
        public static final class PauseGame extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:PauseGame)
                PauseGameOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use PauseGame.newBuilder() to construct.
            private PauseGame(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private PauseGame() {
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new PauseGame();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private PauseGame(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_PauseGame_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_PauseGame_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                PauseGame.class, Builder.class);
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof PauseGame)) {
                    return super.equals(obj);
                }
                PauseGame other = (PauseGame) obj;

                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static PauseGame parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static PauseGame parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static PauseGame parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static PauseGame parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static PauseGame parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static PauseGame parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static PauseGame parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static PauseGame parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static PauseGame parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static PauseGame parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static PauseGame parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static PauseGame parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(PauseGame prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * <pre>
             * Постановка игры на паузу. Применится, если устройство в игровом состоянии
             * </pre>
             *
             * Protobuf type {@code PauseGame}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:PauseGame)
                    PauseGameOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_PauseGame_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_PauseGame_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    PauseGame.class, Builder.class);
                }

                // Construct using ForpostServer.PauseGame.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_PauseGame_descriptor;
                }

                @Override
                public PauseGame getDefaultInstanceForType() {
                    return PauseGame.getDefaultInstance();
                }

                @Override
                public PauseGame build() {
                    PauseGame result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public PauseGame buildPartial() {
                    PauseGame result = new PauseGame(this);
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof PauseGame) {
                        return mergeFrom((PauseGame)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(PauseGame other) {
                    if (other == PauseGame.getDefaultInstance()) return this;
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    PauseGame parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (PauseGame) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:PauseGame)
            }

            // @@protoc_insertion_point(class_scope:PauseGame)
            private static final PauseGame DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new PauseGame();
            }

            public static PauseGame getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<PauseGame>
                    PARSER = new com.google.protobuf.AbstractParser<PauseGame>() {
                @Override
                public PauseGame parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new PauseGame(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<PauseGame> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<PauseGame> getParserForType() {
                return PARSER;
            }

            @Override
            public PauseGame getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface SetIRstrengthOrBuilder extends
                // @@protoc_insertion_point(interface_extends:SetIRstrength)
                com.google.protobuf.MessageOrBuilder {

            /**
             * <code>int32 IR_strength = 1;</code>
             * @return The iRStrength.
             */
            int getIRStrength();
        }
        /**
         * <pre>
         *Смена мощности ИК-луча в % 0 -100
         * </pre>
         *
         * Protobuf type {@code SetIRstrength}
         */
        public static final class SetIRstrength extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:SetIRstrength)
                SetIRstrengthOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use SetIRstrength.newBuilder() to construct.
            private SetIRstrength(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private SetIRstrength() {
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new SetIRstrength();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private SetIRstrength(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            case 8: {

                                iRStrength_ = input.readInt32();
                                break;
                            }
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_SetIRstrength_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_SetIRstrength_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SetIRstrength.class, Builder.class);
            }

            public static final int IR_STRENGTH_FIELD_NUMBER = 1;
            private int iRStrength_;
            /**
             * <code>int32 IR_strength = 1;</code>
             * @return The iRStrength.
             */
            @Override
            public int getIRStrength() {
                return iRStrength_;
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                if (iRStrength_ != 0) {
                    output.writeInt32(1, iRStrength_);
                }
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                if (iRStrength_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(1, iRStrength_);
                }
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SetIRstrength)) {
                    return super.equals(obj);
                }
                SetIRstrength other = (SetIRstrength) obj;

                if (getIRStrength()
                        != other.getIRStrength()) return false;
                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                hash = (37 * hash) + IR_STRENGTH_FIELD_NUMBER;
                hash = (53 * hash) + getIRStrength();
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static SetIRstrength parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SetIRstrength parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SetIRstrength parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SetIRstrength parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SetIRstrength parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SetIRstrength parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SetIRstrength parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static SetIRstrength parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static SetIRstrength parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static SetIRstrength parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static SetIRstrength parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static SetIRstrength parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(SetIRstrength prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * <pre>
             *Смена мощности ИК-луча в % 0 -100
             * </pre>
             *
             * Protobuf type {@code SetIRstrength}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:SetIRstrength)
                    SetIRstrengthOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_SetIRstrength_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_SetIRstrength_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    SetIRstrength.class, Builder.class);
                }

                // Construct using ForpostServer.SetIRstrength.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    iRStrength_ = 0;

                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_SetIRstrength_descriptor;
                }

                @Override
                public SetIRstrength getDefaultInstanceForType() {
                    return SetIRstrength.getDefaultInstance();
                }

                @Override
                public SetIRstrength build() {
                    SetIRstrength result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public SetIRstrength buildPartial() {
                    SetIRstrength result = new SetIRstrength(this);
                    result.iRStrength_ = iRStrength_;
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof SetIRstrength) {
                        return mergeFrom((SetIRstrength)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(SetIRstrength other) {
                    if (other == SetIRstrength.getDefaultInstance()) return this;
                    if (other.getIRStrength() != 0) {
                        setIRStrength(other.getIRStrength());
                    }
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    SetIRstrength parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (SetIRstrength) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }

                private int iRStrength_ ;
                /**
                 * <code>int32 IR_strength = 1;</code>
                 * @return The iRStrength.
                 */
                @Override
                public int getIRStrength() {
                    return iRStrength_;
                }
                /**
                 * <code>int32 IR_strength = 1;</code>
                 * @param value The iRStrength to set.
                 * @return This builder for chaining.
                 */
                public Builder setIRStrength(int value) {

                    iRStrength_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>int32 IR_strength = 1;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearIRStrength() {

                    iRStrength_ = 0;
                    onChanged();
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:SetIRstrength)
            }

            // @@protoc_insertion_point(class_scope:SetIRstrength)
            private static final SetIRstrength DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new SetIRstrength();
            }

            public static SetIRstrength getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<SetIRstrength>
                    PARSER = new com.google.protobuf.AbstractParser<SetIRstrength>() {
                @Override
                public SetIRstrength parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new SetIRstrength(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<SetIRstrength> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<SetIRstrength> getParserForType() {
                return PARSER;
            }

            @Override
            public SetIRstrength getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface DeviceVolumeLevelOrBuilder extends
                // @@protoc_insertion_point(interface_extends:DeviceVolumeLevel)
                com.google.protobuf.MessageOrBuilder {

            /**
             * <pre>
             * Уровень громкости от 0 до 100%
             * </pre>
             *
             * <code>int32 volume_level = 1;</code>
             * @return The volumeLevel.
             */
            int getVolumeLevel();

            /**
             * <pre>
             * уникальный идентификатор устройства
             * </pre>
             *
             * <code>uint32 uid = 2;</code>
             * @return The uid.
             */
            int getUid();
        }
        /**
         * Protobuf type {@code DeviceVolumeLevel}
         */
        public static final class DeviceVolumeLevel extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:DeviceVolumeLevel)
                DeviceVolumeLevelOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use DeviceVolumeLevel.newBuilder() to construct.
            private DeviceVolumeLevel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private DeviceVolumeLevel() {
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new DeviceVolumeLevel();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private DeviceVolumeLevel(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            case 8: {

                                volumeLevel_ = input.readInt32();
                                break;
                            }
                            case 16: {

                                uid_ = input.readUInt32();
                                break;
                            }
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_DeviceVolumeLevel_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_DeviceVolumeLevel_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                DeviceVolumeLevel.class, Builder.class);
            }

            public static final int VOLUME_LEVEL_FIELD_NUMBER = 1;
            private int volumeLevel_;
            /**
             * <pre>
             * Уровень громкости от 0 до 100%
             * </pre>
             *
             * <code>int32 volume_level = 1;</code>
             * @return The volumeLevel.
             */
            @Override
            public int getVolumeLevel() {
                return volumeLevel_;
            }

            public static final int UID_FIELD_NUMBER = 2;
            private int uid_;
            /**
             * <pre>
             * уникальный идентификатор устройства
             * </pre>
             *
             * <code>uint32 uid = 2;</code>
             * @return The uid.
             */
            @Override
            public int getUid() {
                return uid_;
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                if (volumeLevel_ != 0) {
                    output.writeInt32(1, volumeLevel_);
                }
                if (uid_ != 0) {
                    output.writeUInt32(2, uid_);
                }
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                if (volumeLevel_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(1, volumeLevel_);
                }
                if (uid_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeUInt32Size(2, uid_);
                }
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DeviceVolumeLevel)) {
                    return super.equals(obj);
                }
                DeviceVolumeLevel other = (DeviceVolumeLevel) obj;

                if (getVolumeLevel()
                        != other.getVolumeLevel()) return false;
                if (getUid()
                        != other.getUid()) return false;
                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                hash = (37 * hash) + VOLUME_LEVEL_FIELD_NUMBER;
                hash = (53 * hash) + getVolumeLevel();
                hash = (37 * hash) + UID_FIELD_NUMBER;
                hash = (53 * hash) + getUid();
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static DeviceVolumeLevel parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static DeviceVolumeLevel parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static DeviceVolumeLevel parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static DeviceVolumeLevel parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static DeviceVolumeLevel parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static DeviceVolumeLevel parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static DeviceVolumeLevel parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static DeviceVolumeLevel parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static DeviceVolumeLevel parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static DeviceVolumeLevel parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static DeviceVolumeLevel parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static DeviceVolumeLevel parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(DeviceVolumeLevel prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * Protobuf type {@code DeviceVolumeLevel}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:DeviceVolumeLevel)
                    DeviceVolumeLevelOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_DeviceVolumeLevel_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_DeviceVolumeLevel_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    DeviceVolumeLevel.class, Builder.class);
                }

                // Construct using ForpostServer.DeviceVolumeLevel.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    volumeLevel_ = 0;

                    uid_ = 0;

                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_DeviceVolumeLevel_descriptor;
                }

                @Override
                public DeviceVolumeLevel getDefaultInstanceForType() {
                    return DeviceVolumeLevel.getDefaultInstance();
                }

                @Override
                public DeviceVolumeLevel build() {
                    DeviceVolumeLevel result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public DeviceVolumeLevel buildPartial() {
                    DeviceVolumeLevel result = new DeviceVolumeLevel(this);
                    result.volumeLevel_ = volumeLevel_;
                    result.uid_ = uid_;
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof DeviceVolumeLevel) {
                        return mergeFrom((DeviceVolumeLevel)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(DeviceVolumeLevel other) {
                    if (other == DeviceVolumeLevel.getDefaultInstance()) return this;
                    if (other.getVolumeLevel() != 0) {
                        setVolumeLevel(other.getVolumeLevel());
                    }
                    if (other.getUid() != 0) {
                        setUid(other.getUid());
                    }
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    DeviceVolumeLevel parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (DeviceVolumeLevel) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }

                private int volumeLevel_ ;
                /**
                 * <pre>
                 * Уровень громкости от 0 до 100%
                 * </pre>
                 *
                 * <code>int32 volume_level = 1;</code>
                 * @return The volumeLevel.
                 */
                @Override
                public int getVolumeLevel() {
                    return volumeLevel_;
                }
                /**
                 * <pre>
                 * Уровень громкости от 0 до 100%
                 * </pre>
                 *
                 * <code>int32 volume_level = 1;</code>
                 * @param value The volumeLevel to set.
                 * @return This builder for chaining.
                 */
                public Builder setVolumeLevel(int value) {

                    volumeLevel_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * Уровень громкости от 0 до 100%
                 * </pre>
                 *
                 * <code>int32 volume_level = 1;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearVolumeLevel() {

                    volumeLevel_ = 0;
                    onChanged();
                    return this;
                }

                private int uid_ ;
                /**
                 * <pre>
                 * уникальный идентификатор устройства
                 * </pre>
                 *
                 * <code>uint32 uid = 2;</code>
                 * @return The uid.
                 */
                @Override
                public int getUid() {
                    return uid_;
                }
                /**
                 * <pre>
                 * уникальный идентификатор устройства
                 * </pre>
                 *
                 * <code>uint32 uid = 2;</code>
                 * @param value The uid to set.
                 * @return This builder for chaining.
                 */
                public Builder setUid(int value) {

                    uid_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * уникальный идентификатор устройства
                 * </pre>
                 *
                 * <code>uint32 uid = 2;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearUid() {

                    uid_ = 0;
                    onChanged();
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:DeviceVolumeLevel)
            }

            // @@protoc_insertion_point(class_scope:DeviceVolumeLevel)
            private static final DeviceVolumeLevel DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new DeviceVolumeLevel();
            }

            public static DeviceVolumeLevel getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<DeviceVolumeLevel>
                    PARSER = new com.google.protobuf.AbstractParser<DeviceVolumeLevel>() {
                @Override
                public DeviceVolumeLevel parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new DeviceVolumeLevel(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<DeviceVolumeLevel> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<DeviceVolumeLevel> getParserForType() {
                return PARSER;
            }

            @Override
            public DeviceVolumeLevel getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface SetVolumeOrBuilder extends
                // @@protoc_insertion_point(interface_extends:SetVolume)
                com.google.protobuf.MessageOrBuilder {

            /**
             * <pre>
             * Уровень громкости от 0 до 100%. Другие будут проигнорированы
             * </pre>
             *
             * <code>int32 volume_level = 1 [deprecated = true];</code>
             * @return The volumeLevel.
             */
            @Deprecated int getVolumeLevel();

            /**
             * <pre>
             *Уровень громкости устройств
             * </pre>
             *
             * <code>repeated .DeviceVolumeLevel devices_volume_level = 2;</code>
             */
            java.util.List<DeviceVolumeLevel>
            getDevicesVolumeLevelList();
            /**
             * <pre>
             *Уровень громкости устройств
             * </pre>
             *
             * <code>repeated .DeviceVolumeLevel devices_volume_level = 2;</code>
             */
            DeviceVolumeLevel getDevicesVolumeLevel(int index);
            /**
             * <pre>
             *Уровень громкости устройств
             * </pre>
             *
             * <code>repeated .DeviceVolumeLevel devices_volume_level = 2;</code>
             */
            int getDevicesVolumeLevelCount();
            /**
             * <pre>
             *Уровень громкости устройств
             * </pre>
             *
             * <code>repeated .DeviceVolumeLevel devices_volume_level = 2;</code>
             */
            java.util.List<? extends DeviceVolumeLevelOrBuilder>
            getDevicesVolumeLevelOrBuilderList();
            /**
             * <pre>
             *Уровень громкости устройств
             * </pre>
             *
             * <code>repeated .DeviceVolumeLevel devices_volume_level = 2;</code>
             */
            DeviceVolumeLevelOrBuilder getDevicesVolumeLevelOrBuilder(
                    int index);
        }
        /**
         * <pre>
         * Установить уровень громкости в % 0 -100
         * </pre>
         *
         * Protobuf type {@code SetVolume}
         */
        public static final class SetVolume extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:SetVolume)
                SetVolumeOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use SetVolume.newBuilder() to construct.
            private SetVolume(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private SetVolume() {
                devicesVolumeLevel_ = java.util.Collections.emptyList();
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new SetVolume();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private SetVolume(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                int mutable_bitField0_ = 0;
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            case 8: {

                                volumeLevel_ = input.readInt32();
                                break;
                            }
                            case 18: {
                                if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                    devicesVolumeLevel_ = new java.util.ArrayList<DeviceVolumeLevel>();
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                devicesVolumeLevel_.add(
                                        input.readMessage(DeviceVolumeLevel.parser(), extensionRegistry));
                                break;
                            }
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    if (((mutable_bitField0_ & 0x00000001) != 0)) {
                        devicesVolumeLevel_ = java.util.Collections.unmodifiableList(devicesVolumeLevel_);
                    }
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_SetVolume_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_SetVolume_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SetVolume.class, Builder.class);
            }

            public static final int VOLUME_LEVEL_FIELD_NUMBER = 1;
            private int volumeLevel_;
            /**
             * <pre>
             * Уровень громкости от 0 до 100%. Другие будут проигнорированы
             * </pre>
             *
             * <code>int32 volume_level = 1 [deprecated = true];</code>
             * @return The volumeLevel.
             */
            @Override
            @Deprecated public int getVolumeLevel() {
                return volumeLevel_;
            }

            public static final int DEVICES_VOLUME_LEVEL_FIELD_NUMBER = 2;
            private java.util.List<DeviceVolumeLevel> devicesVolumeLevel_;
            /**
             * <pre>
             *Уровень громкости устройств
             * </pre>
             *
             * <code>repeated .DeviceVolumeLevel devices_volume_level = 2;</code>
             */
            @Override
            public java.util.List<DeviceVolumeLevel> getDevicesVolumeLevelList() {
                return devicesVolumeLevel_;
            }
            /**
             * <pre>
             *Уровень громкости устройств
             * </pre>
             *
             * <code>repeated .DeviceVolumeLevel devices_volume_level = 2;</code>
             */
            @Override
            public java.util.List<? extends DeviceVolumeLevelOrBuilder>
            getDevicesVolumeLevelOrBuilderList() {
                return devicesVolumeLevel_;
            }
            /**
             * <pre>
             *Уровень громкости устройств
             * </pre>
             *
             * <code>repeated .DeviceVolumeLevel devices_volume_level = 2;</code>
             */
            @Override
            public int getDevicesVolumeLevelCount() {
                return devicesVolumeLevel_.size();
            }
            /**
             * <pre>
             *Уровень громкости устройств
             * </pre>
             *
             * <code>repeated .DeviceVolumeLevel devices_volume_level = 2;</code>
             */
            @Override
            public DeviceVolumeLevel getDevicesVolumeLevel(int index) {
                return devicesVolumeLevel_.get(index);
            }
            /**
             * <pre>
             *Уровень громкости устройств
             * </pre>
             *
             * <code>repeated .DeviceVolumeLevel devices_volume_level = 2;</code>
             */
            @Override
            public DeviceVolumeLevelOrBuilder getDevicesVolumeLevelOrBuilder(
                    int index) {
                return devicesVolumeLevel_.get(index);
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                if (volumeLevel_ != 0) {
                    output.writeInt32(1, volumeLevel_);
                }
                for (int i = 0; i < devicesVolumeLevel_.size(); i++) {
                    output.writeMessage(2, devicesVolumeLevel_.get(i));
                }
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                if (volumeLevel_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(1, volumeLevel_);
                }
                for (int i = 0; i < devicesVolumeLevel_.size(); i++) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeMessageSize(2, devicesVolumeLevel_.get(i));
                }
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SetVolume)) {
                    return super.equals(obj);
                }
                SetVolume other = (SetVolume) obj;

                if (getVolumeLevel()
                        != other.getVolumeLevel()) return false;
                if (!getDevicesVolumeLevelList()
                        .equals(other.getDevicesVolumeLevelList())) return false;
                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                hash = (37 * hash) + VOLUME_LEVEL_FIELD_NUMBER;
                hash = (53 * hash) + getVolumeLevel();
                if (getDevicesVolumeLevelCount() > 0) {
                    hash = (37 * hash) + DEVICES_VOLUME_LEVEL_FIELD_NUMBER;
                    hash = (53 * hash) + getDevicesVolumeLevelList().hashCode();
                }
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static SetVolume parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SetVolume parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SetVolume parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SetVolume parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SetVolume parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SetVolume parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SetVolume parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static SetVolume parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static SetVolume parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static SetVolume parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static SetVolume parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static SetVolume parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(SetVolume prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * <pre>
             * Установить уровень громкости в % 0 -100
             * </pre>
             *
             * Protobuf type {@code SetVolume}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:SetVolume)
                    SetVolumeOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_SetVolume_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_SetVolume_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    SetVolume.class, Builder.class);
                }

                // Construct using ForpostServer.SetVolume.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                        getDevicesVolumeLevelFieldBuilder();
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    volumeLevel_ = 0;

                    if (devicesVolumeLevelBuilder_ == null) {
                        devicesVolumeLevel_ = java.util.Collections.emptyList();
                        bitField0_ = (bitField0_ & ~0x00000001);
                    } else {
                        devicesVolumeLevelBuilder_.clear();
                    }
                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_SetVolume_descriptor;
                }

                @Override
                public SetVolume getDefaultInstanceForType() {
                    return SetVolume.getDefaultInstance();
                }

                @Override
                public SetVolume build() {
                    SetVolume result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public SetVolume buildPartial() {
                    SetVolume result = new SetVolume(this);
                    int from_bitField0_ = bitField0_;
                    result.volumeLevel_ = volumeLevel_;
                    if (devicesVolumeLevelBuilder_ == null) {
                        if (((bitField0_ & 0x00000001) != 0)) {
                            devicesVolumeLevel_ = java.util.Collections.unmodifiableList(devicesVolumeLevel_);
                            bitField0_ = (bitField0_ & ~0x00000001);
                        }
                        result.devicesVolumeLevel_ = devicesVolumeLevel_;
                    } else {
                        result.devicesVolumeLevel_ = devicesVolumeLevelBuilder_.build();
                    }
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof SetVolume) {
                        return mergeFrom((SetVolume)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(SetVolume other) {
                    if (other == SetVolume.getDefaultInstance()) return this;
                    if (other.getVolumeLevel() != 0) {
                        setVolumeLevel(other.getVolumeLevel());
                    }
                    if (devicesVolumeLevelBuilder_ == null) {
                        if (!other.devicesVolumeLevel_.isEmpty()) {
                            if (devicesVolumeLevel_.isEmpty()) {
                                devicesVolumeLevel_ = other.devicesVolumeLevel_;
                                bitField0_ = (bitField0_ & ~0x00000001);
                            } else {
                                ensureDevicesVolumeLevelIsMutable();
                                devicesVolumeLevel_.addAll(other.devicesVolumeLevel_);
                            }
                            onChanged();
                        }
                    } else {
                        if (!other.devicesVolumeLevel_.isEmpty()) {
                            if (devicesVolumeLevelBuilder_.isEmpty()) {
                                devicesVolumeLevelBuilder_.dispose();
                                devicesVolumeLevelBuilder_ = null;
                                devicesVolumeLevel_ = other.devicesVolumeLevel_;
                                bitField0_ = (bitField0_ & ~0x00000001);
                                devicesVolumeLevelBuilder_ =
                                        com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                                getDevicesVolumeLevelFieldBuilder() : null;
                            } else {
                                devicesVolumeLevelBuilder_.addAllMessages(other.devicesVolumeLevel_);
                            }
                        }
                    }
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    SetVolume parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (SetVolume) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                private int bitField0_;

                private int volumeLevel_ ;
                /**
                 * <pre>
                 * Уровень громкости от 0 до 100%. Другие будут проигнорированы
                 * </pre>
                 *
                 * <code>int32 volume_level = 1 [deprecated = true];</code>
                 * @return The volumeLevel.
                 */
                @Override
                @Deprecated public int getVolumeLevel() {
                    return volumeLevel_;
                }
                /**
                 * <pre>
                 * Уровень громкости от 0 до 100%. Другие будут проигнорированы
                 * </pre>
                 *
                 * <code>int32 volume_level = 1 [deprecated = true];</code>
                 * @param value The volumeLevel to set.
                 * @return This builder for chaining.
                 */
                @Deprecated public Builder setVolumeLevel(int value) {

                    volumeLevel_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * Уровень громкости от 0 до 100%. Другие будут проигнорированы
                 * </pre>
                 *
                 * <code>int32 volume_level = 1 [deprecated = true];</code>
                 * @return This builder for chaining.
                 */
                @Deprecated public Builder clearVolumeLevel() {

                    volumeLevel_ = 0;
                    onChanged();
                    return this;
                }

                private java.util.List<DeviceVolumeLevel> devicesVolumeLevel_ =
                        java.util.Collections.emptyList();
                private void ensureDevicesVolumeLevelIsMutable() {
                    if (!((bitField0_ & 0x00000001) != 0)) {
                        devicesVolumeLevel_ = new java.util.ArrayList<DeviceVolumeLevel>(devicesVolumeLevel_);
                        bitField0_ |= 0x00000001;
                    }
                }

                private com.google.protobuf.RepeatedFieldBuilderV3<
                        DeviceVolumeLevel, DeviceVolumeLevel.Builder, DeviceVolumeLevelOrBuilder> devicesVolumeLevelBuilder_;

                /**
                 * <pre>
                 *Уровень громкости устройств
                 * </pre>
                 *
                 * <code>repeated .DeviceVolumeLevel devices_volume_level = 2;</code>
                 */
                public java.util.List<DeviceVolumeLevel> getDevicesVolumeLevelList() {
                    if (devicesVolumeLevelBuilder_ == null) {
                        return java.util.Collections.unmodifiableList(devicesVolumeLevel_);
                    } else {
                        return devicesVolumeLevelBuilder_.getMessageList();
                    }
                }
                /**
                 * <pre>
                 *Уровень громкости устройств
                 * </pre>
                 *
                 * <code>repeated .DeviceVolumeLevel devices_volume_level = 2;</code>
                 */
                public int getDevicesVolumeLevelCount() {
                    if (devicesVolumeLevelBuilder_ == null) {
                        return devicesVolumeLevel_.size();
                    } else {
                        return devicesVolumeLevelBuilder_.getCount();
                    }
                }
                /**
                 * <pre>
                 *Уровень громкости устройств
                 * </pre>
                 *
                 * <code>repeated .DeviceVolumeLevel devices_volume_level = 2;</code>
                 */
                public DeviceVolumeLevel getDevicesVolumeLevel(int index) {
                    if (devicesVolumeLevelBuilder_ == null) {
                        return devicesVolumeLevel_.get(index);
                    } else {
                        return devicesVolumeLevelBuilder_.getMessage(index);
                    }
                }
                /**
                 * <pre>
                 *Уровень громкости устройств
                 * </pre>
                 *
                 * <code>repeated .DeviceVolumeLevel devices_volume_level = 2;</code>
                 */
                public Builder setDevicesVolumeLevel(
                        int index, DeviceVolumeLevel value) {
                    if (devicesVolumeLevelBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureDevicesVolumeLevelIsMutable();
                        devicesVolumeLevel_.set(index, value);
                        onChanged();
                    } else {
                        devicesVolumeLevelBuilder_.setMessage(index, value);
                    }
                    return this;
                }
                /**
                 * <pre>
                 *Уровень громкости устройств
                 * </pre>
                 *
                 * <code>repeated .DeviceVolumeLevel devices_volume_level = 2;</code>
                 */
                public Builder setDevicesVolumeLevel(
                        int index, DeviceVolumeLevel.Builder builderForValue) {
                    if (devicesVolumeLevelBuilder_ == null) {
                        ensureDevicesVolumeLevelIsMutable();
                        devicesVolumeLevel_.set(index, builderForValue.build());
                        onChanged();
                    } else {
                        devicesVolumeLevelBuilder_.setMessage(index, builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <pre>
                 *Уровень громкости устройств
                 * </pre>
                 *
                 * <code>repeated .DeviceVolumeLevel devices_volume_level = 2;</code>
                 */
                public Builder addDevicesVolumeLevel(DeviceVolumeLevel value) {
                    if (devicesVolumeLevelBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureDevicesVolumeLevelIsMutable();
                        devicesVolumeLevel_.add(value);
                        onChanged();
                    } else {
                        devicesVolumeLevelBuilder_.addMessage(value);
                    }
                    return this;
                }
                /**
                 * <pre>
                 *Уровень громкости устройств
                 * </pre>
                 *
                 * <code>repeated .DeviceVolumeLevel devices_volume_level = 2;</code>
                 */
                public Builder addDevicesVolumeLevel(
                        int index, DeviceVolumeLevel value) {
                    if (devicesVolumeLevelBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureDevicesVolumeLevelIsMutable();
                        devicesVolumeLevel_.add(index, value);
                        onChanged();
                    } else {
                        devicesVolumeLevelBuilder_.addMessage(index, value);
                    }
                    return this;
                }
                /**
                 * <pre>
                 *Уровень громкости устройств
                 * </pre>
                 *
                 * <code>repeated .DeviceVolumeLevel devices_volume_level = 2;</code>
                 */
                public Builder addDevicesVolumeLevel(
                        DeviceVolumeLevel.Builder builderForValue) {
                    if (devicesVolumeLevelBuilder_ == null) {
                        ensureDevicesVolumeLevelIsMutable();
                        devicesVolumeLevel_.add(builderForValue.build());
                        onChanged();
                    } else {
                        devicesVolumeLevelBuilder_.addMessage(builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <pre>
                 *Уровень громкости устройств
                 * </pre>
                 *
                 * <code>repeated .DeviceVolumeLevel devices_volume_level = 2;</code>
                 */
                public Builder addDevicesVolumeLevel(
                        int index, DeviceVolumeLevel.Builder builderForValue) {
                    if (devicesVolumeLevelBuilder_ == null) {
                        ensureDevicesVolumeLevelIsMutable();
                        devicesVolumeLevel_.add(index, builderForValue.build());
                        onChanged();
                    } else {
                        devicesVolumeLevelBuilder_.addMessage(index, builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <pre>
                 *Уровень громкости устройств
                 * </pre>
                 *
                 * <code>repeated .DeviceVolumeLevel devices_volume_level = 2;</code>
                 */
                public Builder addAllDevicesVolumeLevel(
                        Iterable<? extends DeviceVolumeLevel> values) {
                    if (devicesVolumeLevelBuilder_ == null) {
                        ensureDevicesVolumeLevelIsMutable();
                        com.google.protobuf.AbstractMessageLite.Builder.addAll(
                                values, devicesVolumeLevel_);
                        onChanged();
                    } else {
                        devicesVolumeLevelBuilder_.addAllMessages(values);
                    }
                    return this;
                }
                /**
                 * <pre>
                 *Уровень громкости устройств
                 * </pre>
                 *
                 * <code>repeated .DeviceVolumeLevel devices_volume_level = 2;</code>
                 */
                public Builder clearDevicesVolumeLevel() {
                    if (devicesVolumeLevelBuilder_ == null) {
                        devicesVolumeLevel_ = java.util.Collections.emptyList();
                        bitField0_ = (bitField0_ & ~0x00000001);
                        onChanged();
                    } else {
                        devicesVolumeLevelBuilder_.clear();
                    }
                    return this;
                }
                /**
                 * <pre>
                 *Уровень громкости устройств
                 * </pre>
                 *
                 * <code>repeated .DeviceVolumeLevel devices_volume_level = 2;</code>
                 */
                public Builder removeDevicesVolumeLevel(int index) {
                    if (devicesVolumeLevelBuilder_ == null) {
                        ensureDevicesVolumeLevelIsMutable();
                        devicesVolumeLevel_.remove(index);
                        onChanged();
                    } else {
                        devicesVolumeLevelBuilder_.remove(index);
                    }
                    return this;
                }
                /**
                 * <pre>
                 *Уровень громкости устройств
                 * </pre>
                 *
                 * <code>repeated .DeviceVolumeLevel devices_volume_level = 2;</code>
                 */
                public DeviceVolumeLevel.Builder getDevicesVolumeLevelBuilder(
                        int index) {
                    return getDevicesVolumeLevelFieldBuilder().getBuilder(index);
                }
                /**
                 * <pre>
                 *Уровень громкости устройств
                 * </pre>
                 *
                 * <code>repeated .DeviceVolumeLevel devices_volume_level = 2;</code>
                 */
                public DeviceVolumeLevelOrBuilder getDevicesVolumeLevelOrBuilder(
                        int index) {
                    if (devicesVolumeLevelBuilder_ == null) {
                        return devicesVolumeLevel_.get(index);  } else {
                        return devicesVolumeLevelBuilder_.getMessageOrBuilder(index);
                    }
                }
                /**
                 * <pre>
                 *Уровень громкости устройств
                 * </pre>
                 *
                 * <code>repeated .DeviceVolumeLevel devices_volume_level = 2;</code>
                 */
                public java.util.List<? extends DeviceVolumeLevelOrBuilder>
                getDevicesVolumeLevelOrBuilderList() {
                    if (devicesVolumeLevelBuilder_ != null) {
                        return devicesVolumeLevelBuilder_.getMessageOrBuilderList();
                    } else {
                        return java.util.Collections.unmodifiableList(devicesVolumeLevel_);
                    }
                }
                /**
                 * <pre>
                 *Уровень громкости устройств
                 * </pre>
                 *
                 * <code>repeated .DeviceVolumeLevel devices_volume_level = 2;</code>
                 */
                public DeviceVolumeLevel.Builder addDevicesVolumeLevelBuilder() {
                    return getDevicesVolumeLevelFieldBuilder().addBuilder(
                            DeviceVolumeLevel.getDefaultInstance());
                }
                /**
                 * <pre>
                 *Уровень громкости устройств
                 * </pre>
                 *
                 * <code>repeated .DeviceVolumeLevel devices_volume_level = 2;</code>
                 */
                public DeviceVolumeLevel.Builder addDevicesVolumeLevelBuilder(
                        int index) {
                    return getDevicesVolumeLevelFieldBuilder().addBuilder(
                            index, DeviceVolumeLevel.getDefaultInstance());
                }
                /**
                 * <pre>
                 *Уровень громкости устройств
                 * </pre>
                 *
                 * <code>repeated .DeviceVolumeLevel devices_volume_level = 2;</code>
                 */
                public java.util.List<DeviceVolumeLevel.Builder>
                getDevicesVolumeLevelBuilderList() {
                    return getDevicesVolumeLevelFieldBuilder().getBuilderList();
                }
                private com.google.protobuf.RepeatedFieldBuilderV3<
                        DeviceVolumeLevel, DeviceVolumeLevel.Builder, DeviceVolumeLevelOrBuilder>
                getDevicesVolumeLevelFieldBuilder() {
                    if (devicesVolumeLevelBuilder_ == null) {
                        devicesVolumeLevelBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                                DeviceVolumeLevel, DeviceVolumeLevel.Builder, DeviceVolumeLevelOrBuilder>(
                                devicesVolumeLevel_,
                                ((bitField0_ & 0x00000001) != 0),
                                getParentForChildren(),
                                isClean());
                        devicesVolumeLevel_ = null;
                    }
                    return devicesVolumeLevelBuilder_;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:SetVolume)
            }

            // @@protoc_insertion_point(class_scope:SetVolume)
            private static final SetVolume DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new SetVolume();
            }

            public static SetVolume getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<SetVolume>
                    PARSER = new com.google.protobuf.AbstractParser<SetVolume>() {
                @Override
                public SetVolume parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new SetVolume(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<SetVolume> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<SetVolume> getParserForType() {
                return PARSER;
            }

            @Override
            public SetVolume getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface PlaySoundOrBuilder extends
                // @@protoc_insertion_point(interface_extends:PlaySound)
                com.google.protobuf.MessageOrBuilder {

            /**
             * <code>uint32 id = 1;</code>
             * @return The id.
             */
            int getId();

            /**
             * <code>uint32 priority = 2;</code>
             * @return The priority.
             */
            int getPriority();

            /**
             * <code>bool is_looped = 3;</code>
             * @return The isLooped.
             */
            boolean getIsLooped();

            /**
             * <code>string filename = 4;</code>
             * @return The filename.
             */
            String getFilename();
            /**
             * <code>string filename = 4;</code>
             * @return The bytes for filename.
             */
            com.google.protobuf.ByteString
            getFilenameBytes();
        }
        /**
         * Protobuf type {@code PlaySound}
         */
        public static final class PlaySound extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:PlaySound)
                PlaySoundOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use PlaySound.newBuilder() to construct.
            private PlaySound(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private PlaySound() {
                filename_ = "";
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new PlaySound();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private PlaySound(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            case 8: {

                                id_ = input.readUInt32();
                                break;
                            }
                            case 16: {

                                priority_ = input.readUInt32();
                                break;
                            }
                            case 24: {

                                isLooped_ = input.readBool();
                                break;
                            }
                            case 34: {
                                String s = input.readStringRequireUtf8();

                                filename_ = s;
                                break;
                            }
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_PlaySound_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_PlaySound_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                PlaySound.class, Builder.class);
            }

            public static final int ID_FIELD_NUMBER = 1;
            private int id_;
            /**
             * <code>uint32 id = 1;</code>
             * @return The id.
             */
            @Override
            public int getId() {
                return id_;
            }

            public static final int PRIORITY_FIELD_NUMBER = 2;
            private int priority_;
            /**
             * <code>uint32 priority = 2;</code>
             * @return The priority.
             */
            @Override
            public int getPriority() {
                return priority_;
            }

            public static final int IS_LOOPED_FIELD_NUMBER = 3;
            private boolean isLooped_;
            /**
             * <code>bool is_looped = 3;</code>
             * @return The isLooped.
             */
            @Override
            public boolean getIsLooped() {
                return isLooped_;
            }

            public static final int FILENAME_FIELD_NUMBER = 4;
            private volatile Object filename_;
            /**
             * <code>string filename = 4;</code>
             * @return The filename.
             */
            @Override
            public String getFilename() {
                Object ref = filename_;
                if (ref instanceof String) {
                    return (String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    filename_ = s;
                    return s;
                }
            }
            /**
             * <code>string filename = 4;</code>
             * @return The bytes for filename.
             */
            @Override
            public com.google.protobuf.ByteString
            getFilenameBytes() {
                Object ref = filename_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    filename_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                if (id_ != 0) {
                    output.writeUInt32(1, id_);
                }
                if (priority_ != 0) {
                    output.writeUInt32(2, priority_);
                }
                if (isLooped_ != false) {
                    output.writeBool(3, isLooped_);
                }
                if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filename_)) {
                    com.google.protobuf.GeneratedMessageV3.writeString(output, 4, filename_);
                }
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                if (id_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeUInt32Size(1, id_);
                }
                if (priority_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeUInt32Size(2, priority_);
                }
                if (isLooped_ != false) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBoolSize(3, isLooped_);
                }
                if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filename_)) {
                    size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, filename_);
                }
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof PlaySound)) {
                    return super.equals(obj);
                }
                PlaySound other = (PlaySound) obj;

                if (getId()
                        != other.getId()) return false;
                if (getPriority()
                        != other.getPriority()) return false;
                if (getIsLooped()
                        != other.getIsLooped()) return false;
                if (!getFilename()
                        .equals(other.getFilename())) return false;
                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                hash = (37 * hash) + ID_FIELD_NUMBER;
                hash = (53 * hash) + getId();
                hash = (37 * hash) + PRIORITY_FIELD_NUMBER;
                hash = (53 * hash) + getPriority();
                hash = (37 * hash) + IS_LOOPED_FIELD_NUMBER;
                hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
                        getIsLooped());
                hash = (37 * hash) + FILENAME_FIELD_NUMBER;
                hash = (53 * hash) + getFilename().hashCode();
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static PlaySound parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static PlaySound parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static PlaySound parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static PlaySound parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static PlaySound parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static PlaySound parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static PlaySound parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static PlaySound parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static PlaySound parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static PlaySound parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static PlaySound parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static PlaySound parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(PlaySound prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * Protobuf type {@code PlaySound}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:PlaySound)
                    PlaySoundOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_PlaySound_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_PlaySound_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    PlaySound.class, Builder.class);
                }

                // Construct using ForpostServer.PlaySound.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    id_ = 0;

                    priority_ = 0;

                    isLooped_ = false;

                    filename_ = "";

                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_PlaySound_descriptor;
                }

                @Override
                public PlaySound getDefaultInstanceForType() {
                    return PlaySound.getDefaultInstance();
                }

                @Override
                public PlaySound build() {
                    PlaySound result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public PlaySound buildPartial() {
                    PlaySound result = new PlaySound(this);
                    result.id_ = id_;
                    result.priority_ = priority_;
                    result.isLooped_ = isLooped_;
                    result.filename_ = filename_;
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof PlaySound) {
                        return mergeFrom((PlaySound)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(PlaySound other) {
                    if (other == PlaySound.getDefaultInstance()) return this;
                    if (other.getId() != 0) {
                        setId(other.getId());
                    }
                    if (other.getPriority() != 0) {
                        setPriority(other.getPriority());
                    }
                    if (other.getIsLooped() != false) {
                        setIsLooped(other.getIsLooped());
                    }
                    if (!other.getFilename().isEmpty()) {
                        filename_ = other.filename_;
                        onChanged();
                    }
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    PlaySound parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (PlaySound) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }

                private int id_ ;
                /**
                 * <code>uint32 id = 1;</code>
                 * @return The id.
                 */
                @Override
                public int getId() {
                    return id_;
                }
                /**
                 * <code>uint32 id = 1;</code>
                 * @param value The id to set.
                 * @return This builder for chaining.
                 */
                public Builder setId(int value) {

                    id_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>uint32 id = 1;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearId() {

                    id_ = 0;
                    onChanged();
                    return this;
                }

                private int priority_ ;
                /**
                 * <code>uint32 priority = 2;</code>
                 * @return The priority.
                 */
                @Override
                public int getPriority() {
                    return priority_;
                }
                /**
                 * <code>uint32 priority = 2;</code>
                 * @param value The priority to set.
                 * @return This builder for chaining.
                 */
                public Builder setPriority(int value) {

                    priority_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>uint32 priority = 2;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearPriority() {

                    priority_ = 0;
                    onChanged();
                    return this;
                }

                private boolean isLooped_ ;
                /**
                 * <code>bool is_looped = 3;</code>
                 * @return The isLooped.
                 */
                @Override
                public boolean getIsLooped() {
                    return isLooped_;
                }
                /**
                 * <code>bool is_looped = 3;</code>
                 * @param value The isLooped to set.
                 * @return This builder for chaining.
                 */
                public Builder setIsLooped(boolean value) {

                    isLooped_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>bool is_looped = 3;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearIsLooped() {

                    isLooped_ = false;
                    onChanged();
                    return this;
                }

                private Object filename_ = "";
                /**
                 * <code>string filename = 4;</code>
                 * @return The filename.
                 */
                public String getFilename() {
                    Object ref = filename_;
                    if (!(ref instanceof String)) {
                        com.google.protobuf.ByteString bs =
                                (com.google.protobuf.ByteString) ref;
                        String s = bs.toStringUtf8();
                        filename_ = s;
                        return s;
                    } else {
                        return (String) ref;
                    }
                }
                /**
                 * <code>string filename = 4;</code>
                 * @return The bytes for filename.
                 */
                public com.google.protobuf.ByteString
                getFilenameBytes() {
                    Object ref = filename_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (String) ref);
                        filename_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <code>string filename = 4;</code>
                 * @param value The filename to set.
                 * @return This builder for chaining.
                 */
                public Builder setFilename(
                        String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    filename_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>string filename = 4;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearFilename() {

                    filename_ = getDefaultInstance().getFilename();
                    onChanged();
                    return this;
                }
                /**
                 * <code>string filename = 4;</code>
                 * @param value The bytes for filename to set.
                 * @return This builder for chaining.
                 */
                public Builder setFilenameBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    checkByteStringIsUtf8(value);

                    filename_ = value;
                    onChanged();
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:PlaySound)
            }

            // @@protoc_insertion_point(class_scope:PlaySound)
            private static final PlaySound DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new PlaySound();
            }

            public static PlaySound getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<PlaySound>
                    PARSER = new com.google.protobuf.AbstractParser<PlaySound>() {
                @Override
                public PlaySound parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new PlaySound(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<PlaySound> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<PlaySound> getParserForType() {
                return PARSER;
            }

            @Override
            public PlaySound getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface StopSoundOrBuilder extends
                // @@protoc_insertion_point(interface_extends:StopSound)
                com.google.protobuf.MessageOrBuilder {

            /**
             * <code>uint32 id = 1;</code>
             * @return The id.
             */
            int getId();
        }
        /**
         * Protobuf type {@code StopSound}
         */
        public static final class StopSound extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:StopSound)
                StopSoundOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use StopSound.newBuilder() to construct.
            private StopSound(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private StopSound() {
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new StopSound();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private StopSound(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            case 8: {

                                id_ = input.readUInt32();
                                break;
                            }
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_StopSound_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_StopSound_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                StopSound.class, Builder.class);
            }

            public static final int ID_FIELD_NUMBER = 1;
            private int id_;
            /**
             * <code>uint32 id = 1;</code>
             * @return The id.
             */
            @Override
            public int getId() {
                return id_;
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                if (id_ != 0) {
                    output.writeUInt32(1, id_);
                }
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                if (id_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeUInt32Size(1, id_);
                }
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof StopSound)) {
                    return super.equals(obj);
                }
                StopSound other = (StopSound) obj;

                if (getId()
                        != other.getId()) return false;
                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                hash = (37 * hash) + ID_FIELD_NUMBER;
                hash = (53 * hash) + getId();
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static StopSound parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static StopSound parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static StopSound parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static StopSound parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static StopSound parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static StopSound parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static StopSound parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static StopSound parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static StopSound parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static StopSound parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static StopSound parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static StopSound parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(StopSound prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * Protobuf type {@code StopSound}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:StopSound)
                    StopSoundOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_StopSound_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_StopSound_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    StopSound.class, Builder.class);
                }

                // Construct using ForpostServer.StopSound.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    id_ = 0;

                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_StopSound_descriptor;
                }

                @Override
                public StopSound getDefaultInstanceForType() {
                    return StopSound.getDefaultInstance();
                }

                @Override
                public StopSound build() {
                    StopSound result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public StopSound buildPartial() {
                    StopSound result = new StopSound(this);
                    result.id_ = id_;
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof StopSound) {
                        return mergeFrom((StopSound)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(StopSound other) {
                    if (other == StopSound.getDefaultInstance()) return this;
                    if (other.getId() != 0) {
                        setId(other.getId());
                    }
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    StopSound parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (StopSound) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }

                private int id_ ;
                /**
                 * <code>uint32 id = 1;</code>
                 * @return The id.
                 */
                @Override
                public int getId() {
                    return id_;
                }
                /**
                 * <code>uint32 id = 1;</code>
                 * @param value The id to set.
                 * @return This builder for chaining.
                 */
                public Builder setId(int value) {

                    id_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>uint32 id = 1;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearId() {

                    id_ = 0;
                    onChanged();
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:StopSound)
            }

            // @@protoc_insertion_point(class_scope:StopSound)
            private static final StopSound DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new StopSound();
            }

            public static StopSound getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<StopSound>
                    PARSER = new com.google.protobuf.AbstractParser<StopSound>() {
                @Override
                public StopSound parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new StopSound(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<StopSound> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<StopSound> getParserForType() {
                return PARSER;
            }

            @Override
            public StopSound getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface GetSoundsInfoOrBuilder extends
                // @@protoc_insertion_point(interface_extends:GetSoundsInfo)
                com.google.protobuf.MessageOrBuilder {
        }
        /**
         * Protobuf type {@code GetSoundsInfo}
         */
        public static final class GetSoundsInfo extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:GetSoundsInfo)
                GetSoundsInfoOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use GetSoundsInfo.newBuilder() to construct.
            private GetSoundsInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private GetSoundsInfo() {
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new GetSoundsInfo();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private GetSoundsInfo(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_GetSoundsInfo_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_GetSoundsInfo_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                GetSoundsInfo.class, Builder.class);
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof GetSoundsInfo)) {
                    return super.equals(obj);
                }
                GetSoundsInfo other = (GetSoundsInfo) obj;

                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static GetSoundsInfo parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static GetSoundsInfo parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static GetSoundsInfo parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static GetSoundsInfo parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static GetSoundsInfo parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static GetSoundsInfo parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static GetSoundsInfo parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static GetSoundsInfo parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static GetSoundsInfo parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static GetSoundsInfo parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static GetSoundsInfo parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static GetSoundsInfo parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(GetSoundsInfo prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * Protobuf type {@code GetSoundsInfo}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:GetSoundsInfo)
                    GetSoundsInfoOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_GetSoundsInfo_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_GetSoundsInfo_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    GetSoundsInfo.class, Builder.class);
                }

                // Construct using ForpostServer.GetSoundsInfo.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_GetSoundsInfo_descriptor;
                }

                @Override
                public GetSoundsInfo getDefaultInstanceForType() {
                    return GetSoundsInfo.getDefaultInstance();
                }

                @Override
                public GetSoundsInfo build() {
                    GetSoundsInfo result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public GetSoundsInfo buildPartial() {
                    GetSoundsInfo result = new GetSoundsInfo(this);
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof GetSoundsInfo) {
                        return mergeFrom((GetSoundsInfo)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(GetSoundsInfo other) {
                    if (other == GetSoundsInfo.getDefaultInstance()) return this;
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    GetSoundsInfo parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (GetSoundsInfo) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:GetSoundsInfo)
            }

            // @@protoc_insertion_point(class_scope:GetSoundsInfo)
            private static final GetSoundsInfo DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new GetSoundsInfo();
            }

            public static GetSoundsInfo getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<GetSoundsInfo>
                    PARSER = new com.google.protobuf.AbstractParser<GetSoundsInfo>() {
                @Override
                public GetSoundsInfo parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new GetSoundsInfo(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<GetSoundsInfo> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<GetSoundsInfo> getParserForType() {
                return PARSER;
            }

            @Override
            public GetSoundsInfo getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface SoundInfoOrBuilder extends
                // @@protoc_insertion_point(interface_extends:SoundInfo)
                com.google.protobuf.MessageOrBuilder {

            /**
             * <code>string name = 1;</code>
             * @return The name.
             */
            String getName();
            /**
             * <code>string name = 1;</code>
             * @return The bytes for name.
             */
            com.google.protobuf.ByteString
            getNameBytes();

            /**
             * <code>string filename = 3;</code>
             * @return The filename.
             */
            String getFilename();
            /**
             * <code>string filename = 3;</code>
             * @return The bytes for filename.
             */
            com.google.protobuf.ByteString
            getFilenameBytes();
        }
        /**
         * Protobuf type {@code SoundInfo}
         */
        public static final class SoundInfo extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:SoundInfo)
                SoundInfoOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use SoundInfo.newBuilder() to construct.
            private SoundInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private SoundInfo() {
                name_ = "";
                filename_ = "";
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new SoundInfo();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private SoundInfo(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            case 10: {
                                String s = input.readStringRequireUtf8();

                                name_ = s;
                                break;
                            }
                            case 26: {
                                String s = input.readStringRequireUtf8();

                                filename_ = s;
                                break;
                            }
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_SoundInfo_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_SoundInfo_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SoundInfo.class, Builder.class);
            }

            public static final int NAME_FIELD_NUMBER = 1;
            private volatile Object name_;
            /**
             * <code>string name = 1;</code>
             * @return The name.
             */
            @Override
            public String getName() {
                Object ref = name_;
                if (ref instanceof String) {
                    return (String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    name_ = s;
                    return s;
                }
            }
            /**
             * <code>string name = 1;</code>
             * @return The bytes for name.
             */
            @Override
            public com.google.protobuf.ByteString
            getNameBytes() {
                Object ref = name_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    name_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            public static final int FILENAME_FIELD_NUMBER = 3;
            private volatile Object filename_;
            /**
             * <code>string filename = 3;</code>
             * @return The filename.
             */
            @Override
            public String getFilename() {
                Object ref = filename_;
                if (ref instanceof String) {
                    return (String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    filename_ = s;
                    return s;
                }
            }
            /**
             * <code>string filename = 3;</code>
             * @return The bytes for filename.
             */
            @Override
            public com.google.protobuf.ByteString
            getFilenameBytes() {
                Object ref = filename_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    filename_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
                    com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
                }
                if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filename_)) {
                    com.google.protobuf.GeneratedMessageV3.writeString(output, 3, filename_);
                }
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
                    size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
                }
                if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filename_)) {
                    size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, filename_);
                }
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SoundInfo)) {
                    return super.equals(obj);
                }
                SoundInfo other = (SoundInfo) obj;

                if (!getName()
                        .equals(other.getName())) return false;
                if (!getFilename()
                        .equals(other.getFilename())) return false;
                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                hash = (37 * hash) + NAME_FIELD_NUMBER;
                hash = (53 * hash) + getName().hashCode();
                hash = (37 * hash) + FILENAME_FIELD_NUMBER;
                hash = (53 * hash) + getFilename().hashCode();
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static SoundInfo parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SoundInfo parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SoundInfo parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SoundInfo parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SoundInfo parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SoundInfo parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SoundInfo parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static SoundInfo parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static SoundInfo parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static SoundInfo parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static SoundInfo parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static SoundInfo parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(SoundInfo prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * Protobuf type {@code SoundInfo}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:SoundInfo)
                    SoundInfoOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_SoundInfo_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_SoundInfo_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    SoundInfo.class, Builder.class);
                }

                // Construct using ForpostServer.SoundInfo.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    name_ = "";

                    filename_ = "";

                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_SoundInfo_descriptor;
                }

                @Override
                public SoundInfo getDefaultInstanceForType() {
                    return SoundInfo.getDefaultInstance();
                }

                @Override
                public SoundInfo build() {
                    SoundInfo result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public SoundInfo buildPartial() {
                    SoundInfo result = new SoundInfo(this);
                    result.name_ = name_;
                    result.filename_ = filename_;
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof SoundInfo) {
                        return mergeFrom((SoundInfo)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(SoundInfo other) {
                    if (other == SoundInfo.getDefaultInstance()) return this;
                    if (!other.getName().isEmpty()) {
                        name_ = other.name_;
                        onChanged();
                    }
                    if (!other.getFilename().isEmpty()) {
                        filename_ = other.filename_;
                        onChanged();
                    }
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    SoundInfo parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (SoundInfo) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }

                private Object name_ = "";
                /**
                 * <code>string name = 1;</code>
                 * @return The name.
                 */
                public String getName() {
                    Object ref = name_;
                    if (!(ref instanceof String)) {
                        com.google.protobuf.ByteString bs =
                                (com.google.protobuf.ByteString) ref;
                        String s = bs.toStringUtf8();
                        name_ = s;
                        return s;
                    } else {
                        return (String) ref;
                    }
                }
                /**
                 * <code>string name = 1;</code>
                 * @return The bytes for name.
                 */
                public com.google.protobuf.ByteString
                getNameBytes() {
                    Object ref = name_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (String) ref);
                        name_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <code>string name = 1;</code>
                 * @param value The name to set.
                 * @return This builder for chaining.
                 */
                public Builder setName(
                        String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    name_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>string name = 1;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearName() {

                    name_ = getDefaultInstance().getName();
                    onChanged();
                    return this;
                }
                /**
                 * <code>string name = 1;</code>
                 * @param value The bytes for name to set.
                 * @return This builder for chaining.
                 */
                public Builder setNameBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    checkByteStringIsUtf8(value);

                    name_ = value;
                    onChanged();
                    return this;
                }

                private Object filename_ = "";
                /**
                 * <code>string filename = 3;</code>
                 * @return The filename.
                 */
                public String getFilename() {
                    Object ref = filename_;
                    if (!(ref instanceof String)) {
                        com.google.protobuf.ByteString bs =
                                (com.google.protobuf.ByteString) ref;
                        String s = bs.toStringUtf8();
                        filename_ = s;
                        return s;
                    } else {
                        return (String) ref;
                    }
                }
                /**
                 * <code>string filename = 3;</code>
                 * @return The bytes for filename.
                 */
                public com.google.protobuf.ByteString
                getFilenameBytes() {
                    Object ref = filename_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (String) ref);
                        filename_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <code>string filename = 3;</code>
                 * @param value The filename to set.
                 * @return This builder for chaining.
                 */
                public Builder setFilename(
                        String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    filename_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>string filename = 3;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearFilename() {

                    filename_ = getDefaultInstance().getFilename();
                    onChanged();
                    return this;
                }
                /**
                 * <code>string filename = 3;</code>
                 * @param value The bytes for filename to set.
                 * @return This builder for chaining.
                 */
                public Builder setFilenameBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    checkByteStringIsUtf8(value);

                    filename_ = value;
                    onChanged();
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:SoundInfo)
            }

            // @@protoc_insertion_point(class_scope:SoundInfo)
            private static final SoundInfo DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new SoundInfo();
            }

            public static SoundInfo getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<SoundInfo>
                    PARSER = new com.google.protobuf.AbstractParser<SoundInfo>() {
                @Override
                public SoundInfo parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new SoundInfo(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<SoundInfo> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<SoundInfo> getParserForType() {
                return PARSER;
            }

            @Override
            public SoundInfo getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface SoundsInfoResponceOrBuilder extends
                // @@protoc_insertion_point(interface_extends:SoundsInfoResponce)
                com.google.protobuf.MessageOrBuilder {

            /**
             * <code>repeated .SoundInfo info = 1;</code>
             */
            java.util.List<SoundInfo>
            getInfoList();
            /**
             * <code>repeated .SoundInfo info = 1;</code>
             */
            SoundInfo getInfo(int index);
            /**
             * <code>repeated .SoundInfo info = 1;</code>
             */
            int getInfoCount();
            /**
             * <code>repeated .SoundInfo info = 1;</code>
             */
            java.util.List<? extends SoundInfoOrBuilder>
            getInfoOrBuilderList();
            /**
             * <code>repeated .SoundInfo info = 1;</code>
             */
            SoundInfoOrBuilder getInfoOrBuilder(
                    int index);

            /**
             * <code>int32 status = 2;</code>
             * @return The status.
             */
            int getStatus();
        }
        /**
         * Protobuf type {@code SoundsInfoResponce}
         */
        public static final class SoundsInfoResponce extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:SoundsInfoResponce)
                SoundsInfoResponceOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use SoundsInfoResponce.newBuilder() to construct.
            private SoundsInfoResponce(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private SoundsInfoResponce() {
                info_ = java.util.Collections.emptyList();
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new SoundsInfoResponce();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private SoundsInfoResponce(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                int mutable_bitField0_ = 0;
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            case 10: {
                                if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                    info_ = new java.util.ArrayList<SoundInfo>();
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                info_.add(
                                        input.readMessage(SoundInfo.parser(), extensionRegistry));
                                break;
                            }
                            case 16: {

                                status_ = input.readInt32();
                                break;
                            }
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    if (((mutable_bitField0_ & 0x00000001) != 0)) {
                        info_ = java.util.Collections.unmodifiableList(info_);
                    }
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_SoundsInfoResponce_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_SoundsInfoResponce_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SoundsInfoResponce.class, Builder.class);
            }

            public static final int INFO_FIELD_NUMBER = 1;
            private java.util.List<SoundInfo> info_;
            /**
             * <code>repeated .SoundInfo info = 1;</code>
             */
            @Override
            public java.util.List<SoundInfo> getInfoList() {
                return info_;
            }
            /**
             * <code>repeated .SoundInfo info = 1;</code>
             */
            @Override
            public java.util.List<? extends SoundInfoOrBuilder>
            getInfoOrBuilderList() {
                return info_;
            }
            /**
             * <code>repeated .SoundInfo info = 1;</code>
             */
            @Override
            public int getInfoCount() {
                return info_.size();
            }
            /**
             * <code>repeated .SoundInfo info = 1;</code>
             */
            @Override
            public SoundInfo getInfo(int index) {
                return info_.get(index);
            }
            /**
             * <code>repeated .SoundInfo info = 1;</code>
             */
            @Override
            public SoundInfoOrBuilder getInfoOrBuilder(
                    int index) {
                return info_.get(index);
            }

            public static final int STATUS_FIELD_NUMBER = 2;
            private int status_;
            /**
             * <code>int32 status = 2;</code>
             * @return The status.
             */
            @Override
            public int getStatus() {
                return status_;
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                for (int i = 0; i < info_.size(); i++) {
                    output.writeMessage(1, info_.get(i));
                }
                if (status_ != 0) {
                    output.writeInt32(2, status_);
                }
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                for (int i = 0; i < info_.size(); i++) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeMessageSize(1, info_.get(i));
                }
                if (status_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(2, status_);
                }
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SoundsInfoResponce)) {
                    return super.equals(obj);
                }
                SoundsInfoResponce other = (SoundsInfoResponce) obj;

                if (!getInfoList()
                        .equals(other.getInfoList())) return false;
                if (getStatus()
                        != other.getStatus()) return false;
                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                if (getInfoCount() > 0) {
                    hash = (37 * hash) + INFO_FIELD_NUMBER;
                    hash = (53 * hash) + getInfoList().hashCode();
                }
                hash = (37 * hash) + STATUS_FIELD_NUMBER;
                hash = (53 * hash) + getStatus();
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static SoundsInfoResponce parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SoundsInfoResponce parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SoundsInfoResponce parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SoundsInfoResponce parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SoundsInfoResponce parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SoundsInfoResponce parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SoundsInfoResponce parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static SoundsInfoResponce parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static SoundsInfoResponce parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static SoundsInfoResponce parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static SoundsInfoResponce parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static SoundsInfoResponce parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(SoundsInfoResponce prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * Protobuf type {@code SoundsInfoResponce}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:SoundsInfoResponce)
                    SoundsInfoResponceOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_SoundsInfoResponce_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_SoundsInfoResponce_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    SoundsInfoResponce.class, Builder.class);
                }

                // Construct using ForpostServer.SoundsInfoResponce.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                        getInfoFieldBuilder();
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    if (infoBuilder_ == null) {
                        info_ = java.util.Collections.emptyList();
                        bitField0_ = (bitField0_ & ~0x00000001);
                    } else {
                        infoBuilder_.clear();
                    }
                    status_ = 0;

                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_SoundsInfoResponce_descriptor;
                }

                @Override
                public SoundsInfoResponce getDefaultInstanceForType() {
                    return SoundsInfoResponce.getDefaultInstance();
                }

                @Override
                public SoundsInfoResponce build() {
                    SoundsInfoResponce result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public SoundsInfoResponce buildPartial() {
                    SoundsInfoResponce result = new SoundsInfoResponce(this);
                    int from_bitField0_ = bitField0_;
                    if (infoBuilder_ == null) {
                        if (((bitField0_ & 0x00000001) != 0)) {
                            info_ = java.util.Collections.unmodifiableList(info_);
                            bitField0_ = (bitField0_ & ~0x00000001);
                        }
                        result.info_ = info_;
                    } else {
                        result.info_ = infoBuilder_.build();
                    }
                    result.status_ = status_;
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof SoundsInfoResponce) {
                        return mergeFrom((SoundsInfoResponce)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(SoundsInfoResponce other) {
                    if (other == SoundsInfoResponce.getDefaultInstance()) return this;
                    if (infoBuilder_ == null) {
                        if (!other.info_.isEmpty()) {
                            if (info_.isEmpty()) {
                                info_ = other.info_;
                                bitField0_ = (bitField0_ & ~0x00000001);
                            } else {
                                ensureInfoIsMutable();
                                info_.addAll(other.info_);
                            }
                            onChanged();
                        }
                    } else {
                        if (!other.info_.isEmpty()) {
                            if (infoBuilder_.isEmpty()) {
                                infoBuilder_.dispose();
                                infoBuilder_ = null;
                                info_ = other.info_;
                                bitField0_ = (bitField0_ & ~0x00000001);
                                infoBuilder_ =
                                        com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                                getInfoFieldBuilder() : null;
                            } else {
                                infoBuilder_.addAllMessages(other.info_);
                            }
                        }
                    }
                    if (other.getStatus() != 0) {
                        setStatus(other.getStatus());
                    }
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    SoundsInfoResponce parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (SoundsInfoResponce) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                private int bitField0_;

                private java.util.List<SoundInfo> info_ =
                        java.util.Collections.emptyList();
                private void ensureInfoIsMutable() {
                    if (!((bitField0_ & 0x00000001) != 0)) {
                        info_ = new java.util.ArrayList<SoundInfo>(info_);
                        bitField0_ |= 0x00000001;
                    }
                }

                private com.google.protobuf.RepeatedFieldBuilderV3<
                        SoundInfo, SoundInfo.Builder, SoundInfoOrBuilder> infoBuilder_;

                /**
                 * <code>repeated .SoundInfo info = 1;</code>
                 */
                public java.util.List<SoundInfo> getInfoList() {
                    if (infoBuilder_ == null) {
                        return java.util.Collections.unmodifiableList(info_);
                    } else {
                        return infoBuilder_.getMessageList();
                    }
                }
                /**
                 * <code>repeated .SoundInfo info = 1;</code>
                 */
                public int getInfoCount() {
                    if (infoBuilder_ == null) {
                        return info_.size();
                    } else {
                        return infoBuilder_.getCount();
                    }
                }
                /**
                 * <code>repeated .SoundInfo info = 1;</code>
                 */
                public SoundInfo getInfo(int index) {
                    if (infoBuilder_ == null) {
                        return info_.get(index);
                    } else {
                        return infoBuilder_.getMessage(index);
                    }
                }
                /**
                 * <code>repeated .SoundInfo info = 1;</code>
                 */
                public Builder setInfo(
                        int index, SoundInfo value) {
                    if (infoBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureInfoIsMutable();
                        info_.set(index, value);
                        onChanged();
                    } else {
                        infoBuilder_.setMessage(index, value);
                    }
                    return this;
                }
                /**
                 * <code>repeated .SoundInfo info = 1;</code>
                 */
                public Builder setInfo(
                        int index, SoundInfo.Builder builderForValue) {
                    if (infoBuilder_ == null) {
                        ensureInfoIsMutable();
                        info_.set(index, builderForValue.build());
                        onChanged();
                    } else {
                        infoBuilder_.setMessage(index, builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <code>repeated .SoundInfo info = 1;</code>
                 */
                public Builder addInfo(SoundInfo value) {
                    if (infoBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureInfoIsMutable();
                        info_.add(value);
                        onChanged();
                    } else {
                        infoBuilder_.addMessage(value);
                    }
                    return this;
                }
                /**
                 * <code>repeated .SoundInfo info = 1;</code>
                 */
                public Builder addInfo(
                        int index, SoundInfo value) {
                    if (infoBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureInfoIsMutable();
                        info_.add(index, value);
                        onChanged();
                    } else {
                        infoBuilder_.addMessage(index, value);
                    }
                    return this;
                }
                /**
                 * <code>repeated .SoundInfo info = 1;</code>
                 */
                public Builder addInfo(
                        SoundInfo.Builder builderForValue) {
                    if (infoBuilder_ == null) {
                        ensureInfoIsMutable();
                        info_.add(builderForValue.build());
                        onChanged();
                    } else {
                        infoBuilder_.addMessage(builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <code>repeated .SoundInfo info = 1;</code>
                 */
                public Builder addInfo(
                        int index, SoundInfo.Builder builderForValue) {
                    if (infoBuilder_ == null) {
                        ensureInfoIsMutable();
                        info_.add(index, builderForValue.build());
                        onChanged();
                    } else {
                        infoBuilder_.addMessage(index, builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <code>repeated .SoundInfo info = 1;</code>
                 */
                public Builder addAllInfo(
                        Iterable<? extends SoundInfo> values) {
                    if (infoBuilder_ == null) {
                        ensureInfoIsMutable();
                        com.google.protobuf.AbstractMessageLite.Builder.addAll(
                                values, info_);
                        onChanged();
                    } else {
                        infoBuilder_.addAllMessages(values);
                    }
                    return this;
                }
                /**
                 * <code>repeated .SoundInfo info = 1;</code>
                 */
                public Builder clearInfo() {
                    if (infoBuilder_ == null) {
                        info_ = java.util.Collections.emptyList();
                        bitField0_ = (bitField0_ & ~0x00000001);
                        onChanged();
                    } else {
                        infoBuilder_.clear();
                    }
                    return this;
                }
                /**
                 * <code>repeated .SoundInfo info = 1;</code>
                 */
                public Builder removeInfo(int index) {
                    if (infoBuilder_ == null) {
                        ensureInfoIsMutable();
                        info_.remove(index);
                        onChanged();
                    } else {
                        infoBuilder_.remove(index);
                    }
                    return this;
                }
                /**
                 * <code>repeated .SoundInfo info = 1;</code>
                 */
                public SoundInfo.Builder getInfoBuilder(
                        int index) {
                    return getInfoFieldBuilder().getBuilder(index);
                }
                /**
                 * <code>repeated .SoundInfo info = 1;</code>
                 */
                public SoundInfoOrBuilder getInfoOrBuilder(
                        int index) {
                    if (infoBuilder_ == null) {
                        return info_.get(index);  } else {
                        return infoBuilder_.getMessageOrBuilder(index);
                    }
                }
                /**
                 * <code>repeated .SoundInfo info = 1;</code>
                 */
                public java.util.List<? extends SoundInfoOrBuilder>
                getInfoOrBuilderList() {
                    if (infoBuilder_ != null) {
                        return infoBuilder_.getMessageOrBuilderList();
                    } else {
                        return java.util.Collections.unmodifiableList(info_);
                    }
                }
                /**
                 * <code>repeated .SoundInfo info = 1;</code>
                 */
                public SoundInfo.Builder addInfoBuilder() {
                    return getInfoFieldBuilder().addBuilder(
                            SoundInfo.getDefaultInstance());
                }
                /**
                 * <code>repeated .SoundInfo info = 1;</code>
                 */
                public SoundInfo.Builder addInfoBuilder(
                        int index) {
                    return getInfoFieldBuilder().addBuilder(
                            index, SoundInfo.getDefaultInstance());
                }
                /**
                 * <code>repeated .SoundInfo info = 1;</code>
                 */
                public java.util.List<SoundInfo.Builder>
                getInfoBuilderList() {
                    return getInfoFieldBuilder().getBuilderList();
                }
                private com.google.protobuf.RepeatedFieldBuilderV3<
                        SoundInfo, SoundInfo.Builder, SoundInfoOrBuilder>
                getInfoFieldBuilder() {
                    if (infoBuilder_ == null) {
                        infoBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                                SoundInfo, SoundInfo.Builder, SoundInfoOrBuilder>(
                                info_,
                                ((bitField0_ & 0x00000001) != 0),
                                getParentForChildren(),
                                isClean());
                        info_ = null;
                    }
                    return infoBuilder_;
                }

                private int status_ ;
                /**
                 * <code>int32 status = 2;</code>
                 * @return The status.
                 */
                @Override
                public int getStatus() {
                    return status_;
                }
                /**
                 * <code>int32 status = 2;</code>
                 * @param value The status to set.
                 * @return This builder for chaining.
                 */
                public Builder setStatus(int value) {

                    status_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>int32 status = 2;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearStatus() {

                    status_ = 0;
                    onChanged();
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:SoundsInfoResponce)
            }

            // @@protoc_insertion_point(class_scope:SoundsInfoResponce)
            private static final SoundsInfoResponce DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new SoundsInfoResponce();
            }

            public static SoundsInfoResponce getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<SoundsInfoResponce>
                    PARSER = new com.google.protobuf.AbstractParser<SoundsInfoResponce>() {
                @Override
                public SoundsInfoResponce parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new SoundsInfoResponce(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<SoundsInfoResponce> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<SoundsInfoResponce> getParserForType() {
                return PARSER;
            }

            @Override
            public SoundsInfoResponce getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface SlaveInfoOrBuilder extends
                // @@protoc_insertion_point(interface_extends:SlaveInfo)
                com.google.protobuf.MessageOrBuilder {

            /**
             * <code>.SlaveType type = 1;</code>
             * @return The enum numeric value on the wire for type.
             */
            int getTypeValue();
            /**
             * <code>.SlaveType type = 1;</code>
             * @return The type.
             */
            SlaveType getType();

            /**
             * <code>int32 dev_id = 2;</code>
             * @return The devId.
             */
            int getDevId();

            /**
             * <code>bytes firmware_ver = 3;</code>
             * @return The firmwareVer.
             */
            com.google.protobuf.ByteString getFirmwareVer();

            /**
             * <code>bytes bios_ver = 4;</code>
             * @return The biosVer.
             */
            com.google.protobuf.ByteString getBiosVer();

            /**
             * <code>bytes boot_ver = 5;</code>
             * @return The bootVer.
             */
            com.google.protobuf.ByteString getBootVer();
        }
        /**
         * Protobuf type {@code SlaveInfo}
         */
        public static final class SlaveInfo extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:SlaveInfo)
                SlaveInfoOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use SlaveInfo.newBuilder() to construct.
            private SlaveInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private SlaveInfo() {
                type_ = 0;
                firmwareVer_ = com.google.protobuf.ByteString.EMPTY;
                biosVer_ = com.google.protobuf.ByteString.EMPTY;
                bootVer_ = com.google.protobuf.ByteString.EMPTY;
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new SlaveInfo();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private SlaveInfo(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            case 8: {
                                int rawValue = input.readEnum();

                                type_ = rawValue;
                                break;
                            }
                            case 16: {

                                devId_ = input.readInt32();
                                break;
                            }
                            case 26: {

                                firmwareVer_ = input.readBytes();
                                break;
                            }
                            case 34: {

                                biosVer_ = input.readBytes();
                                break;
                            }
                            case 42: {

                                bootVer_ = input.readBytes();
                                break;
                            }
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_SlaveInfo_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_SlaveInfo_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SlaveInfo.class, Builder.class);
            }

            public static final int TYPE_FIELD_NUMBER = 1;
            private int type_;
            /**
             * <code>.SlaveType type = 1;</code>
             * @return The enum numeric value on the wire for type.
             */
            @Override public int getTypeValue() {
                return type_;
            }
            /**
             * <code>.SlaveType type = 1;</code>
             * @return The type.
             */
            @Override public SlaveType getType() {
                @SuppressWarnings("deprecation")
                SlaveType result = SlaveType.valueOf(type_);
                return result == null ? SlaveType.UNRECOGNIZED : result;
            }

            public static final int DEV_ID_FIELD_NUMBER = 2;
            private int devId_;
            /**
             * <code>int32 dev_id = 2;</code>
             * @return The devId.
             */
            @Override
            public int getDevId() {
                return devId_;
            }

            public static final int FIRMWARE_VER_FIELD_NUMBER = 3;
            private com.google.protobuf.ByteString firmwareVer_;
            /**
             * <code>bytes firmware_ver = 3;</code>
             * @return The firmwareVer.
             */
            @Override
            public com.google.protobuf.ByteString getFirmwareVer() {
                return firmwareVer_;
            }

            public static final int BIOS_VER_FIELD_NUMBER = 4;
            private com.google.protobuf.ByteString biosVer_;
            /**
             * <code>bytes bios_ver = 4;</code>
             * @return The biosVer.
             */
            @Override
            public com.google.protobuf.ByteString getBiosVer() {
                return biosVer_;
            }

            public static final int BOOT_VER_FIELD_NUMBER = 5;
            private com.google.protobuf.ByteString bootVer_;
            /**
             * <code>bytes boot_ver = 5;</code>
             * @return The bootVer.
             */
            @Override
            public com.google.protobuf.ByteString getBootVer() {
                return bootVer_;
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                if (type_ != SlaveType.SlaveType_Unknow.getNumber()) {
                    output.writeEnum(1, type_);
                }
                if (devId_ != 0) {
                    output.writeInt32(2, devId_);
                }
                if (!firmwareVer_.isEmpty()) {
                    output.writeBytes(3, firmwareVer_);
                }
                if (!biosVer_.isEmpty()) {
                    output.writeBytes(4, biosVer_);
                }
                if (!bootVer_.isEmpty()) {
                    output.writeBytes(5, bootVer_);
                }
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                if (type_ != SlaveType.SlaveType_Unknow.getNumber()) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeEnumSize(1, type_);
                }
                if (devId_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(2, devId_);
                }
                if (!firmwareVer_.isEmpty()) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(3, firmwareVer_);
                }
                if (!biosVer_.isEmpty()) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(4, biosVer_);
                }
                if (!bootVer_.isEmpty()) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(5, bootVer_);
                }
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SlaveInfo)) {
                    return super.equals(obj);
                }
                SlaveInfo other = (SlaveInfo) obj;

                if (type_ != other.type_) return false;
                if (getDevId()
                        != other.getDevId()) return false;
                if (!getFirmwareVer()
                        .equals(other.getFirmwareVer())) return false;
                if (!getBiosVer()
                        .equals(other.getBiosVer())) return false;
                if (!getBootVer()
                        .equals(other.getBootVer())) return false;
                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                hash = (37 * hash) + TYPE_FIELD_NUMBER;
                hash = (53 * hash) + type_;
                hash = (37 * hash) + DEV_ID_FIELD_NUMBER;
                hash = (53 * hash) + getDevId();
                hash = (37 * hash) + FIRMWARE_VER_FIELD_NUMBER;
                hash = (53 * hash) + getFirmwareVer().hashCode();
                hash = (37 * hash) + BIOS_VER_FIELD_NUMBER;
                hash = (53 * hash) + getBiosVer().hashCode();
                hash = (37 * hash) + BOOT_VER_FIELD_NUMBER;
                hash = (53 * hash) + getBootVer().hashCode();
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static SlaveInfo parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SlaveInfo parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SlaveInfo parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SlaveInfo parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SlaveInfo parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SlaveInfo parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SlaveInfo parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static SlaveInfo parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static SlaveInfo parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static SlaveInfo parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static SlaveInfo parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static SlaveInfo parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(SlaveInfo prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * Protobuf type {@code SlaveInfo}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:SlaveInfo)
                    SlaveInfoOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_SlaveInfo_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_SlaveInfo_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    SlaveInfo.class, Builder.class);
                }

                // Construct using ForpostServer.SlaveInfo.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    type_ = 0;

                    devId_ = 0;

                    firmwareVer_ = com.google.protobuf.ByteString.EMPTY;

                    biosVer_ = com.google.protobuf.ByteString.EMPTY;

                    bootVer_ = com.google.protobuf.ByteString.EMPTY;

                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_SlaveInfo_descriptor;
                }

                @Override
                public SlaveInfo getDefaultInstanceForType() {
                    return SlaveInfo.getDefaultInstance();
                }

                @Override
                public SlaveInfo build() {
                    SlaveInfo result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public SlaveInfo buildPartial() {
                    SlaveInfo result = new SlaveInfo(this);
                    result.type_ = type_;
                    result.devId_ = devId_;
                    result.firmwareVer_ = firmwareVer_;
                    result.biosVer_ = biosVer_;
                    result.bootVer_ = bootVer_;
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof SlaveInfo) {
                        return mergeFrom((SlaveInfo)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(SlaveInfo other) {
                    if (other == SlaveInfo.getDefaultInstance()) return this;
                    if (other.type_ != 0) {
                        setTypeValue(other.getTypeValue());
                    }
                    if (other.getDevId() != 0) {
                        setDevId(other.getDevId());
                    }
                    if (other.getFirmwareVer() != com.google.protobuf.ByteString.EMPTY) {
                        setFirmwareVer(other.getFirmwareVer());
                    }
                    if (other.getBiosVer() != com.google.protobuf.ByteString.EMPTY) {
                        setBiosVer(other.getBiosVer());
                    }
                    if (other.getBootVer() != com.google.protobuf.ByteString.EMPTY) {
                        setBootVer(other.getBootVer());
                    }
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    SlaveInfo parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (SlaveInfo) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }

                private int type_ = 0;
                /**
                 * <code>.SlaveType type = 1;</code>
                 * @return The enum numeric value on the wire for type.
                 */
                @Override public int getTypeValue() {
                    return type_;
                }
                /**
                 * <code>.SlaveType type = 1;</code>
                 * @param value The enum numeric value on the wire for type to set.
                 * @return This builder for chaining.
                 */
                public Builder setTypeValue(int value) {

                    type_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>.SlaveType type = 1;</code>
                 * @return The type.
                 */
                @Override
                public SlaveType getType() {
                    @SuppressWarnings("deprecation")
                    SlaveType result = SlaveType.valueOf(type_);
                    return result == null ? SlaveType.UNRECOGNIZED : result;
                }
                /**
                 * <code>.SlaveType type = 1;</code>
                 * @param value The type to set.
                 * @return This builder for chaining.
                 */
                public Builder setType(SlaveType value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    type_ = value.getNumber();
                    onChanged();
                    return this;
                }
                /**
                 * <code>.SlaveType type = 1;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearType() {

                    type_ = 0;
                    onChanged();
                    return this;
                }

                private int devId_ ;
                /**
                 * <code>int32 dev_id = 2;</code>
                 * @return The devId.
                 */
                @Override
                public int getDevId() {
                    return devId_;
                }
                /**
                 * <code>int32 dev_id = 2;</code>
                 * @param value The devId to set.
                 * @return This builder for chaining.
                 */
                public Builder setDevId(int value) {

                    devId_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>int32 dev_id = 2;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearDevId() {

                    devId_ = 0;
                    onChanged();
                    return this;
                }

                private com.google.protobuf.ByteString firmwareVer_ = com.google.protobuf.ByteString.EMPTY;
                /**
                 * <code>bytes firmware_ver = 3;</code>
                 * @return The firmwareVer.
                 */
                @Override
                public com.google.protobuf.ByteString getFirmwareVer() {
                    return firmwareVer_;
                }
                /**
                 * <code>bytes firmware_ver = 3;</code>
                 * @param value The firmwareVer to set.
                 * @return This builder for chaining.
                 */
                public Builder setFirmwareVer(com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    firmwareVer_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>bytes firmware_ver = 3;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearFirmwareVer() {

                    firmwareVer_ = getDefaultInstance().getFirmwareVer();
                    onChanged();
                    return this;
                }

                private com.google.protobuf.ByteString biosVer_ = com.google.protobuf.ByteString.EMPTY;
                /**
                 * <code>bytes bios_ver = 4;</code>
                 * @return The biosVer.
                 */
                @Override
                public com.google.protobuf.ByteString getBiosVer() {
                    return biosVer_;
                }
                /**
                 * <code>bytes bios_ver = 4;</code>
                 * @param value The biosVer to set.
                 * @return This builder for chaining.
                 */
                public Builder setBiosVer(com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    biosVer_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>bytes bios_ver = 4;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearBiosVer() {

                    biosVer_ = getDefaultInstance().getBiosVer();
                    onChanged();
                    return this;
                }

                private com.google.protobuf.ByteString bootVer_ = com.google.protobuf.ByteString.EMPTY;
                /**
                 * <code>bytes boot_ver = 5;</code>
                 * @return The bootVer.
                 */
                @Override
                public com.google.protobuf.ByteString getBootVer() {
                    return bootVer_;
                }
                /**
                 * <code>bytes boot_ver = 5;</code>
                 * @param value The bootVer to set.
                 * @return This builder for chaining.
                 */
                public Builder setBootVer(com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    bootVer_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>bytes boot_ver = 5;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearBootVer() {

                    bootVer_ = getDefaultInstance().getBootVer();
                    onChanged();
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:SlaveInfo)
            }

            // @@protoc_insertion_point(class_scope:SlaveInfo)
            private static final SlaveInfo DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new SlaveInfo();
            }

            public static SlaveInfo getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<SlaveInfo>
                    PARSER = new com.google.protobuf.AbstractParser<SlaveInfo>() {
                @Override
                public SlaveInfo parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new SlaveInfo(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<SlaveInfo> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<SlaveInfo> getParserForType() {
                return PARSER;
            }

            @Override
            public SlaveInfo getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface SlavesInfoResponceOrBuilder extends
                // @@protoc_insertion_point(interface_extends:SlavesInfoResponce)
                com.google.protobuf.MessageOrBuilder {

            /**
             * <code>repeated .SlaveInfo info = 1;</code>
             */
            java.util.List<SlaveInfo>
            getInfoList();
            /**
             * <code>repeated .SlaveInfo info = 1;</code>
             */
            SlaveInfo getInfo(int index);
            /**
             * <code>repeated .SlaveInfo info = 1;</code>
             */
            int getInfoCount();
            /**
             * <code>repeated .SlaveInfo info = 1;</code>
             */
            java.util.List<? extends SlaveInfoOrBuilder>
            getInfoOrBuilderList();
            /**
             * <code>repeated .SlaveInfo info = 1;</code>
             */
            SlaveInfoOrBuilder getInfoOrBuilder(
                    int index);

            /**
             * <code>int32 status = 2;</code>
             * @return The status.
             */
            int getStatus();
        }
        /**
         * Protobuf type {@code SlavesInfoResponce}
         */
        public static final class SlavesInfoResponce extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:SlavesInfoResponce)
                SlavesInfoResponceOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use SlavesInfoResponce.newBuilder() to construct.
            private SlavesInfoResponce(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private SlavesInfoResponce() {
                info_ = java.util.Collections.emptyList();
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new SlavesInfoResponce();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private SlavesInfoResponce(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                int mutable_bitField0_ = 0;
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            case 10: {
                                if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                    info_ = new java.util.ArrayList<SlaveInfo>();
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                info_.add(
                                        input.readMessage(SlaveInfo.parser(), extensionRegistry));
                                break;
                            }
                            case 16: {

                                status_ = input.readInt32();
                                break;
                            }
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    if (((mutable_bitField0_ & 0x00000001) != 0)) {
                        info_ = java.util.Collections.unmodifiableList(info_);
                    }
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_SlavesInfoResponce_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_SlavesInfoResponce_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SlavesInfoResponce.class, Builder.class);
            }

            public static final int INFO_FIELD_NUMBER = 1;
            private java.util.List<SlaveInfo> info_;
            /**
             * <code>repeated .SlaveInfo info = 1;</code>
             */
            @Override
            public java.util.List<SlaveInfo> getInfoList() {
                return info_;
            }
            /**
             * <code>repeated .SlaveInfo info = 1;</code>
             */
            @Override
            public java.util.List<? extends SlaveInfoOrBuilder>
            getInfoOrBuilderList() {
                return info_;
            }
            /**
             * <code>repeated .SlaveInfo info = 1;</code>
             */
            @Override
            public int getInfoCount() {
                return info_.size();
            }
            /**
             * <code>repeated .SlaveInfo info = 1;</code>
             */
            @Override
            public SlaveInfo getInfo(int index) {
                return info_.get(index);
            }
            /**
             * <code>repeated .SlaveInfo info = 1;</code>
             */
            @Override
            public SlaveInfoOrBuilder getInfoOrBuilder(
                    int index) {
                return info_.get(index);
            }

            public static final int STATUS_FIELD_NUMBER = 2;
            private int status_;
            /**
             * <code>int32 status = 2;</code>
             * @return The status.
             */
            @Override
            public int getStatus() {
                return status_;
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                for (int i = 0; i < info_.size(); i++) {
                    output.writeMessage(1, info_.get(i));
                }
                if (status_ != 0) {
                    output.writeInt32(2, status_);
                }
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                for (int i = 0; i < info_.size(); i++) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeMessageSize(1, info_.get(i));
                }
                if (status_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(2, status_);
                }
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SlavesInfoResponce)) {
                    return super.equals(obj);
                }
                SlavesInfoResponce other = (SlavesInfoResponce) obj;

                if (!getInfoList()
                        .equals(other.getInfoList())) return false;
                if (getStatus()
                        != other.getStatus()) return false;
                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                if (getInfoCount() > 0) {
                    hash = (37 * hash) + INFO_FIELD_NUMBER;
                    hash = (53 * hash) + getInfoList().hashCode();
                }
                hash = (37 * hash) + STATUS_FIELD_NUMBER;
                hash = (53 * hash) + getStatus();
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static SlavesInfoResponce parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SlavesInfoResponce parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SlavesInfoResponce parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SlavesInfoResponce parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SlavesInfoResponce parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SlavesInfoResponce parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SlavesInfoResponce parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static SlavesInfoResponce parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static SlavesInfoResponce parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static SlavesInfoResponce parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static SlavesInfoResponce parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static SlavesInfoResponce parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(SlavesInfoResponce prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * Protobuf type {@code SlavesInfoResponce}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:SlavesInfoResponce)
                    SlavesInfoResponceOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_SlavesInfoResponce_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_SlavesInfoResponce_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    SlavesInfoResponce.class, Builder.class);
                }

                // Construct using ForpostServer.SlavesInfoResponce.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                        getInfoFieldBuilder();
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    if (infoBuilder_ == null) {
                        info_ = java.util.Collections.emptyList();
                        bitField0_ = (bitField0_ & ~0x00000001);
                    } else {
                        infoBuilder_.clear();
                    }
                    status_ = 0;

                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_SlavesInfoResponce_descriptor;
                }

                @Override
                public SlavesInfoResponce getDefaultInstanceForType() {
                    return SlavesInfoResponce.getDefaultInstance();
                }

                @Override
                public SlavesInfoResponce build() {
                    SlavesInfoResponce result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public SlavesInfoResponce buildPartial() {
                    SlavesInfoResponce result = new SlavesInfoResponce(this);
                    int from_bitField0_ = bitField0_;
                    if (infoBuilder_ == null) {
                        if (((bitField0_ & 0x00000001) != 0)) {
                            info_ = java.util.Collections.unmodifiableList(info_);
                            bitField0_ = (bitField0_ & ~0x00000001);
                        }
                        result.info_ = info_;
                    } else {
                        result.info_ = infoBuilder_.build();
                    }
                    result.status_ = status_;
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof SlavesInfoResponce) {
                        return mergeFrom((SlavesInfoResponce)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(SlavesInfoResponce other) {
                    if (other == SlavesInfoResponce.getDefaultInstance()) return this;
                    if (infoBuilder_ == null) {
                        if (!other.info_.isEmpty()) {
                            if (info_.isEmpty()) {
                                info_ = other.info_;
                                bitField0_ = (bitField0_ & ~0x00000001);
                            } else {
                                ensureInfoIsMutable();
                                info_.addAll(other.info_);
                            }
                            onChanged();
                        }
                    } else {
                        if (!other.info_.isEmpty()) {
                            if (infoBuilder_.isEmpty()) {
                                infoBuilder_.dispose();
                                infoBuilder_ = null;
                                info_ = other.info_;
                                bitField0_ = (bitField0_ & ~0x00000001);
                                infoBuilder_ =
                                        com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                                getInfoFieldBuilder() : null;
                            } else {
                                infoBuilder_.addAllMessages(other.info_);
                            }
                        }
                    }
                    if (other.getStatus() != 0) {
                        setStatus(other.getStatus());
                    }
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    SlavesInfoResponce parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (SlavesInfoResponce) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                private int bitField0_;

                private java.util.List<SlaveInfo> info_ =
                        java.util.Collections.emptyList();
                private void ensureInfoIsMutable() {
                    if (!((bitField0_ & 0x00000001) != 0)) {
                        info_ = new java.util.ArrayList<SlaveInfo>(info_);
                        bitField0_ |= 0x00000001;
                    }
                }

                private com.google.protobuf.RepeatedFieldBuilderV3<
                        SlaveInfo, SlaveInfo.Builder, SlaveInfoOrBuilder> infoBuilder_;

                /**
                 * <code>repeated .SlaveInfo info = 1;</code>
                 */
                public java.util.List<SlaveInfo> getInfoList() {
                    if (infoBuilder_ == null) {
                        return java.util.Collections.unmodifiableList(info_);
                    } else {
                        return infoBuilder_.getMessageList();
                    }
                }
                /**
                 * <code>repeated .SlaveInfo info = 1;</code>
                 */
                public int getInfoCount() {
                    if (infoBuilder_ == null) {
                        return info_.size();
                    } else {
                        return infoBuilder_.getCount();
                    }
                }
                /**
                 * <code>repeated .SlaveInfo info = 1;</code>
                 */
                public SlaveInfo getInfo(int index) {
                    if (infoBuilder_ == null) {
                        return info_.get(index);
                    } else {
                        return infoBuilder_.getMessage(index);
                    }
                }
                /**
                 * <code>repeated .SlaveInfo info = 1;</code>
                 */
                public Builder setInfo(
                        int index, SlaveInfo value) {
                    if (infoBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureInfoIsMutable();
                        info_.set(index, value);
                        onChanged();
                    } else {
                        infoBuilder_.setMessage(index, value);
                    }
                    return this;
                }
                /**
                 * <code>repeated .SlaveInfo info = 1;</code>
                 */
                public Builder setInfo(
                        int index, SlaveInfo.Builder builderForValue) {
                    if (infoBuilder_ == null) {
                        ensureInfoIsMutable();
                        info_.set(index, builderForValue.build());
                        onChanged();
                    } else {
                        infoBuilder_.setMessage(index, builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <code>repeated .SlaveInfo info = 1;</code>
                 */
                public Builder addInfo(SlaveInfo value) {
                    if (infoBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureInfoIsMutable();
                        info_.add(value);
                        onChanged();
                    } else {
                        infoBuilder_.addMessage(value);
                    }
                    return this;
                }
                /**
                 * <code>repeated .SlaveInfo info = 1;</code>
                 */
                public Builder addInfo(
                        int index, SlaveInfo value) {
                    if (infoBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureInfoIsMutable();
                        info_.add(index, value);
                        onChanged();
                    } else {
                        infoBuilder_.addMessage(index, value);
                    }
                    return this;
                }
                /**
                 * <code>repeated .SlaveInfo info = 1;</code>
                 */
                public Builder addInfo(
                        SlaveInfo.Builder builderForValue) {
                    if (infoBuilder_ == null) {
                        ensureInfoIsMutable();
                        info_.add(builderForValue.build());
                        onChanged();
                    } else {
                        infoBuilder_.addMessage(builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <code>repeated .SlaveInfo info = 1;</code>
                 */
                public Builder addInfo(
                        int index, SlaveInfo.Builder builderForValue) {
                    if (infoBuilder_ == null) {
                        ensureInfoIsMutable();
                        info_.add(index, builderForValue.build());
                        onChanged();
                    } else {
                        infoBuilder_.addMessage(index, builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <code>repeated .SlaveInfo info = 1;</code>
                 */
                public Builder addAllInfo(
                        Iterable<? extends SlaveInfo> values) {
                    if (infoBuilder_ == null) {
                        ensureInfoIsMutable();
                        com.google.protobuf.AbstractMessageLite.Builder.addAll(
                                values, info_);
                        onChanged();
                    } else {
                        infoBuilder_.addAllMessages(values);
                    }
                    return this;
                }
                /**
                 * <code>repeated .SlaveInfo info = 1;</code>
                 */
                public Builder clearInfo() {
                    if (infoBuilder_ == null) {
                        info_ = java.util.Collections.emptyList();
                        bitField0_ = (bitField0_ & ~0x00000001);
                        onChanged();
                    } else {
                        infoBuilder_.clear();
                    }
                    return this;
                }
                /**
                 * <code>repeated .SlaveInfo info = 1;</code>
                 */
                public Builder removeInfo(int index) {
                    if (infoBuilder_ == null) {
                        ensureInfoIsMutable();
                        info_.remove(index);
                        onChanged();
                    } else {
                        infoBuilder_.remove(index);
                    }
                    return this;
                }
                /**
                 * <code>repeated .SlaveInfo info = 1;</code>
                 */
                public SlaveInfo.Builder getInfoBuilder(
                        int index) {
                    return getInfoFieldBuilder().getBuilder(index);
                }
                /**
                 * <code>repeated .SlaveInfo info = 1;</code>
                 */
                public SlaveInfoOrBuilder getInfoOrBuilder(
                        int index) {
                    if (infoBuilder_ == null) {
                        return info_.get(index);  } else {
                        return infoBuilder_.getMessageOrBuilder(index);
                    }
                }
                /**
                 * <code>repeated .SlaveInfo info = 1;</code>
                 */
                public java.util.List<? extends SlaveInfoOrBuilder>
                getInfoOrBuilderList() {
                    if (infoBuilder_ != null) {
                        return infoBuilder_.getMessageOrBuilderList();
                    } else {
                        return java.util.Collections.unmodifiableList(info_);
                    }
                }
                /**
                 * <code>repeated .SlaveInfo info = 1;</code>
                 */
                public SlaveInfo.Builder addInfoBuilder() {
                    return getInfoFieldBuilder().addBuilder(
                            SlaveInfo.getDefaultInstance());
                }
                /**
                 * <code>repeated .SlaveInfo info = 1;</code>
                 */
                public SlaveInfo.Builder addInfoBuilder(
                        int index) {
                    return getInfoFieldBuilder().addBuilder(
                            index, SlaveInfo.getDefaultInstance());
                }
                /**
                 * <code>repeated .SlaveInfo info = 1;</code>
                 */
                public java.util.List<SlaveInfo.Builder>
                getInfoBuilderList() {
                    return getInfoFieldBuilder().getBuilderList();
                }
                private com.google.protobuf.RepeatedFieldBuilderV3<
                        SlaveInfo, SlaveInfo.Builder, SlaveInfoOrBuilder>
                getInfoFieldBuilder() {
                    if (infoBuilder_ == null) {
                        infoBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                                SlaveInfo, SlaveInfo.Builder, SlaveInfoOrBuilder>(
                                info_,
                                ((bitField0_ & 0x00000001) != 0),
                                getParentForChildren(),
                                isClean());
                        info_ = null;
                    }
                    return infoBuilder_;
                }

                private int status_ ;
                /**
                 * <code>int32 status = 2;</code>
                 * @return The status.
                 */
                @Override
                public int getStatus() {
                    return status_;
                }
                /**
                 * <code>int32 status = 2;</code>
                 * @param value The status to set.
                 * @return This builder for chaining.
                 */
                public Builder setStatus(int value) {

                    status_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>int32 status = 2;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearStatus() {

                    status_ = 0;
                    onChanged();
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:SlavesInfoResponce)
            }

            // @@protoc_insertion_point(class_scope:SlavesInfoResponce)
            private static final SlavesInfoResponce DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new SlavesInfoResponce();
            }

            public static SlavesInfoResponce getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<SlavesInfoResponce>
                    PARSER = new com.google.protobuf.AbstractParser<SlavesInfoResponce>() {
                @Override
                public SlavesInfoResponce parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new SlavesInfoResponce(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<SlavesInfoResponce> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<SlavesInfoResponce> getParserForType() {
                return PARSER;
            }

            @Override
            public SlavesInfoResponce getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface SlaveDisconnectedOrBuilder extends
                // @@protoc_insertion_point(interface_extends:SlaveDisconnected)
                com.google.protobuf.MessageOrBuilder {

            /**
             * <code>int32 dev_id = 1;</code>
             * @return The devId.
             */
            int getDevId();
        }
        /**
         * Protobuf type {@code SlaveDisconnected}
         */
        public static final class SlaveDisconnected extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:SlaveDisconnected)
                SlaveDisconnectedOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use SlaveDisconnected.newBuilder() to construct.
            private SlaveDisconnected(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private SlaveDisconnected() {
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new SlaveDisconnected();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private SlaveDisconnected(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            case 8: {

                                devId_ = input.readInt32();
                                break;
                            }
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_SlaveDisconnected_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_SlaveDisconnected_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SlaveDisconnected.class, Builder.class);
            }

            public static final int DEV_ID_FIELD_NUMBER = 1;
            private int devId_;
            /**
             * <code>int32 dev_id = 1;</code>
             * @return The devId.
             */
            @Override
            public int getDevId() {
                return devId_;
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                if (devId_ != 0) {
                    output.writeInt32(1, devId_);
                }
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                if (devId_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(1, devId_);
                }
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SlaveDisconnected)) {
                    return super.equals(obj);
                }
                SlaveDisconnected other = (SlaveDisconnected) obj;

                if (getDevId()
                        != other.getDevId()) return false;
                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                hash = (37 * hash) + DEV_ID_FIELD_NUMBER;
                hash = (53 * hash) + getDevId();
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static SlaveDisconnected parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SlaveDisconnected parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SlaveDisconnected parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SlaveDisconnected parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SlaveDisconnected parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SlaveDisconnected parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SlaveDisconnected parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static SlaveDisconnected parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static SlaveDisconnected parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static SlaveDisconnected parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static SlaveDisconnected parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static SlaveDisconnected parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(SlaveDisconnected prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * Protobuf type {@code SlaveDisconnected}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:SlaveDisconnected)
                    SlaveDisconnectedOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_SlaveDisconnected_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_SlaveDisconnected_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    SlaveDisconnected.class, Builder.class);
                }

                // Construct using ForpostServer.SlaveDisconnected.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    devId_ = 0;

                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_SlaveDisconnected_descriptor;
                }

                @Override
                public SlaveDisconnected getDefaultInstanceForType() {
                    return SlaveDisconnected.getDefaultInstance();
                }

                @Override
                public SlaveDisconnected build() {
                    SlaveDisconnected result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public SlaveDisconnected buildPartial() {
                    SlaveDisconnected result = new SlaveDisconnected(this);
                    result.devId_ = devId_;
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof SlaveDisconnected) {
                        return mergeFrom((SlaveDisconnected)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(SlaveDisconnected other) {
                    if (other == SlaveDisconnected.getDefaultInstance()) return this;
                    if (other.getDevId() != 0) {
                        setDevId(other.getDevId());
                    }
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    SlaveDisconnected parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (SlaveDisconnected) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }

                private int devId_ ;
                /**
                 * <code>int32 dev_id = 1;</code>
                 * @return The devId.
                 */
                @Override
                public int getDevId() {
                    return devId_;
                }
                /**
                 * <code>int32 dev_id = 1;</code>
                 * @param value The devId to set.
                 * @return This builder for chaining.
                 */
                public Builder setDevId(int value) {

                    devId_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>int32 dev_id = 1;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearDevId() {

                    devId_ = 0;
                    onChanged();
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:SlaveDisconnected)
            }

            // @@protoc_insertion_point(class_scope:SlaveDisconnected)
            private static final SlaveDisconnected DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new SlaveDisconnected();
            }

            public static SlaveDisconnected getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<SlaveDisconnected>
                    PARSER = new com.google.protobuf.AbstractParser<SlaveDisconnected>() {
                @Override
                public SlaveDisconnected parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new SlaveDisconnected(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<SlaveDisconnected> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<SlaveDisconnected> getParserForType() {
                return PARSER;
            }

            @Override
            public SlaveDisconnected getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface KitBatteryLevelOrBuilder extends
                // @@protoc_insertion_point(interface_extends:KitBatteryLevel)
                com.google.protobuf.MessageOrBuilder {

            /**
             * <pre>
             * уровень заряда батареи
             * </pre>
             *
             * <code>int32 battery_level = 1;</code>
             * @return The batteryLevel.
             */
            int getBatteryLevel();

            /**
             * <pre>
             * уникальный идентификатор устройства
             * </pre>
             *
             * <code>uint32 id = 2;</code>
             * @return The id.
             */
            int getId();
        }
        /**
         * Protobuf type {@code KitBatteryLevel}
         */
        public static final class KitBatteryLevel extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:KitBatteryLevel)
                KitBatteryLevelOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use KitBatteryLevel.newBuilder() to construct.
            private KitBatteryLevel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private KitBatteryLevel() {
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new KitBatteryLevel();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private KitBatteryLevel(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            case 8: {

                                batteryLevel_ = input.readInt32();
                                break;
                            }
                            case 16: {

                                id_ = input.readUInt32();
                                break;
                            }
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_KitBatteryLevel_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_KitBatteryLevel_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                KitBatteryLevel.class, Builder.class);
            }

            public static final int BATTERY_LEVEL_FIELD_NUMBER = 1;
            private int batteryLevel_;
            /**
             * <pre>
             * уровень заряда батареи
             * </pre>
             *
             * <code>int32 battery_level = 1;</code>
             * @return The batteryLevel.
             */
            @Override
            public int getBatteryLevel() {
                return batteryLevel_;
            }

            public static final int ID_FIELD_NUMBER = 2;
            private int id_;
            /**
             * <pre>
             * уникальный идентификатор устройства
             * </pre>
             *
             * <code>uint32 id = 2;</code>
             * @return The id.
             */
            @Override
            public int getId() {
                return id_;
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                if (batteryLevel_ != 0) {
                    output.writeInt32(1, batteryLevel_);
                }
                if (id_ != 0) {
                    output.writeUInt32(2, id_);
                }
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                if (batteryLevel_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(1, batteryLevel_);
                }
                if (id_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeUInt32Size(2, id_);
                }
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof KitBatteryLevel)) {
                    return super.equals(obj);
                }
                KitBatteryLevel other = (KitBatteryLevel) obj;

                if (getBatteryLevel()
                        != other.getBatteryLevel()) return false;
                if (getId()
                        != other.getId()) return false;
                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                hash = (37 * hash) + BATTERY_LEVEL_FIELD_NUMBER;
                hash = (53 * hash) + getBatteryLevel();
                hash = (37 * hash) + ID_FIELD_NUMBER;
                hash = (53 * hash) + getId();
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static KitBatteryLevel parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static KitBatteryLevel parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static KitBatteryLevel parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static KitBatteryLevel parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static KitBatteryLevel parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static KitBatteryLevel parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static KitBatteryLevel parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static KitBatteryLevel parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static KitBatteryLevel parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static KitBatteryLevel parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static KitBatteryLevel parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static KitBatteryLevel parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(KitBatteryLevel prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * Protobuf type {@code KitBatteryLevel}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:KitBatteryLevel)
                    KitBatteryLevelOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_KitBatteryLevel_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_KitBatteryLevel_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    KitBatteryLevel.class, Builder.class);
                }

                // Construct using ForpostServer.KitBatteryLevel.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    batteryLevel_ = 0;

                    id_ = 0;

                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_KitBatteryLevel_descriptor;
                }

                @Override
                public KitBatteryLevel getDefaultInstanceForType() {
                    return KitBatteryLevel.getDefaultInstance();
                }

                @Override
                public KitBatteryLevel build() {
                    KitBatteryLevel result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public KitBatteryLevel buildPartial() {
                    KitBatteryLevel result = new KitBatteryLevel(this);
                    result.batteryLevel_ = batteryLevel_;
                    result.id_ = id_;
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof KitBatteryLevel) {
                        return mergeFrom((KitBatteryLevel)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(KitBatteryLevel other) {
                    if (other == KitBatteryLevel.getDefaultInstance()) return this;
                    if (other.getBatteryLevel() != 0) {
                        setBatteryLevel(other.getBatteryLevel());
                    }
                    if (other.getId() != 0) {
                        setId(other.getId());
                    }
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    KitBatteryLevel parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (KitBatteryLevel) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }

                private int batteryLevel_ ;
                /**
                 * <pre>
                 * уровень заряда батареи
                 * </pre>
                 *
                 * <code>int32 battery_level = 1;</code>
                 * @return The batteryLevel.
                 */
                @Override
                public int getBatteryLevel() {
                    return batteryLevel_;
                }
                /**
                 * <pre>
                 * уровень заряда батареи
                 * </pre>
                 *
                 * <code>int32 battery_level = 1;</code>
                 * @param value The batteryLevel to set.
                 * @return This builder for chaining.
                 */
                public Builder setBatteryLevel(int value) {

                    batteryLevel_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * уровень заряда батареи
                 * </pre>
                 *
                 * <code>int32 battery_level = 1;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearBatteryLevel() {

                    batteryLevel_ = 0;
                    onChanged();
                    return this;
                }

                private int id_ ;
                /**
                 * <pre>
                 * уникальный идентификатор устройства
                 * </pre>
                 *
                 * <code>uint32 id = 2;</code>
                 * @return The id.
                 */
                @Override
                public int getId() {
                    return id_;
                }
                /**
                 * <pre>
                 * уникальный идентификатор устройства
                 * </pre>
                 *
                 * <code>uint32 id = 2;</code>
                 * @param value The id to set.
                 * @return This builder for chaining.
                 */
                public Builder setId(int value) {

                    id_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * уникальный идентификатор устройства
                 * </pre>
                 *
                 * <code>uint32 id = 2;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearId() {

                    id_ = 0;
                    onChanged();
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:KitBatteryLevel)
            }

            // @@protoc_insertion_point(class_scope:KitBatteryLevel)
            private static final KitBatteryLevel DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new KitBatteryLevel();
            }

            public static KitBatteryLevel getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<KitBatteryLevel>
                    PARSER = new com.google.protobuf.AbstractParser<KitBatteryLevel>() {
                @Override
                public KitBatteryLevel parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new KitBatteryLevel(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<KitBatteryLevel> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<KitBatteryLevel> getParserForType() {
                return PARSER;
            }

            @Override
            public KitBatteryLevel getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface ChangeIdOrBuilder extends
                // @@protoc_insertion_point(interface_extends:ChangeId)
                com.google.protobuf.MessageOrBuilder {

            /**
             * <pre>
             * ID на который нужно перейти или уже перешли
             * </pre>
             *
             * <code>int32 next_id = 1;</code>
             * @return The nextId.
             */
            int getNextId();
        }
        /**
         * <pre>
         * От сервера к устройству - команда смены ИД устройства.
         * </pre>
         *
         * Protobuf type {@code ChangeId}
         */
        public static final class ChangeId extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:ChangeId)
                ChangeIdOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use ChangeId.newBuilder() to construct.
            private ChangeId(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private ChangeId() {
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new ChangeId();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private ChangeId(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            case 8: {

                                nextId_ = input.readInt32();
                                break;
                            }
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_ChangeId_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_ChangeId_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                ChangeId.class, Builder.class);
            }

            public static final int NEXT_ID_FIELD_NUMBER = 1;
            private int nextId_;
            /**
             * <pre>
             * ID на который нужно перейти или уже перешли
             * </pre>
             *
             * <code>int32 next_id = 1;</code>
             * @return The nextId.
             */
            @Override
            public int getNextId() {
                return nextId_;
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                if (nextId_ != 0) {
                    output.writeInt32(1, nextId_);
                }
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                if (nextId_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(1, nextId_);
                }
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ChangeId)) {
                    return super.equals(obj);
                }
                ChangeId other = (ChangeId) obj;

                if (getNextId()
                        != other.getNextId()) return false;
                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                hash = (37 * hash) + NEXT_ID_FIELD_NUMBER;
                hash = (53 * hash) + getNextId();
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static ChangeId parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static ChangeId parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static ChangeId parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static ChangeId parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static ChangeId parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static ChangeId parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static ChangeId parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static ChangeId parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static ChangeId parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static ChangeId parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static ChangeId parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static ChangeId parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(ChangeId prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * <pre>
             * От сервера к устройству - команда смены ИД устройства.
             * </pre>
             *
             * Protobuf type {@code ChangeId}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:ChangeId)
                    ChangeIdOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_ChangeId_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_ChangeId_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    ChangeId.class, Builder.class);
                }

                // Construct using ForpostServer.ChangeId.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    nextId_ = 0;

                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_ChangeId_descriptor;
                }

                @Override
                public ChangeId getDefaultInstanceForType() {
                    return ChangeId.getDefaultInstance();
                }

                @Override
                public ChangeId build() {
                    ChangeId result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public ChangeId buildPartial() {
                    ChangeId result = new ChangeId(this);
                    result.nextId_ = nextId_;
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof ChangeId) {
                        return mergeFrom((ChangeId)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(ChangeId other) {
                    if (other == ChangeId.getDefaultInstance()) return this;
                    if (other.getNextId() != 0) {
                        setNextId(other.getNextId());
                    }
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    ChangeId parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (ChangeId) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }

                private int nextId_ ;
                /**
                 * <pre>
                 * ID на который нужно перейти или уже перешли
                 * </pre>
                 *
                 * <code>int32 next_id = 1;</code>
                 * @return The nextId.
                 */
                @Override
                public int getNextId() {
                    return nextId_;
                }
                /**
                 * <pre>
                 * ID на который нужно перейти или уже перешли
                 * </pre>
                 *
                 * <code>int32 next_id = 1;</code>
                 * @param value The nextId to set.
                 * @return This builder for chaining.
                 */
                public Builder setNextId(int value) {

                    nextId_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * ID на который нужно перейти или уже перешли
                 * </pre>
                 *
                 * <code>int32 next_id = 1;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearNextId() {

                    nextId_ = 0;
                    onChanged();
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:ChangeId)
            }

            // @@protoc_insertion_point(class_scope:ChangeId)
            private static final ChangeId DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new ChangeId();
            }

            public static ChangeId getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<ChangeId>
                    PARSER = new com.google.protobuf.AbstractParser<ChangeId>() {
                @Override
                public ChangeId parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new ChangeId(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<ChangeId> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<ChangeId> getParserForType() {
                return PARSER;
            }

            @Override
            public ChangeId getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface PingOrBuilder extends
                // @@protoc_insertion_point(interface_extends:Ping)
                com.google.protobuf.MessageOrBuilder {
        }
        /**
         * <pre>
         * Регулярное сообщение присылать каждую секунду
         * </pre>
         *
         * Protobuf type {@code Ping}
         */
        public static final class Ping extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:Ping)
                PingOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use Ping.newBuilder() to construct.
            private Ping(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private Ping() {
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new Ping();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private Ping(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_Ping_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_Ping_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Ping.class, Builder.class);
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Ping)) {
                    return super.equals(obj);
                }
                Ping other = (Ping) obj;

                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static Ping parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Ping parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Ping parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Ping parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Ping parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Ping parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Ping parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static Ping parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static Ping parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static Ping parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static Ping parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static Ping parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(Ping prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * <pre>
             * Регулярное сообщение присылать каждую секунду
             * </pre>
             *
             * Protobuf type {@code Ping}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:Ping)
                    PingOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_Ping_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_Ping_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    Ping.class, Builder.class);
                }

                // Construct using ForpostServer.Ping.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_Ping_descriptor;
                }

                @Override
                public Ping getDefaultInstanceForType() {
                    return Ping.getDefaultInstance();
                }

                @Override
                public Ping build() {
                    Ping result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public Ping buildPartial() {
                    Ping result = new Ping(this);
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof Ping) {
                        return mergeFrom((Ping)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(Ping other) {
                    if (other == Ping.getDefaultInstance()) return this;
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    Ping parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (Ping) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:Ping)
            }

            // @@protoc_insertion_point(class_scope:Ping)
            private static final Ping DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new Ping();
            }

            public static Ping getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<Ping>
                    PARSER = new com.google.protobuf.AbstractParser<Ping>() {
                @Override
                public Ping parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new Ping(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<Ping> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<Ping> getParserForType() {
                return PARSER;
            }

            @Override
            public Ping getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface ResetStatOrBuilder extends
                // @@protoc_insertion_point(interface_extends:ResetStat)
                com.google.protobuf.MessageOrBuilder {
        }
        /**
         * <pre>
         * Команда сброса статистики
         * </pre>
         *
         * Protobuf type {@code ResetStat}
         */
        public static final class ResetStat extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:ResetStat)
                ResetStatOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use ResetStat.newBuilder() to construct.
            private ResetStat(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private ResetStat() {
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new ResetStat();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private ResetStat(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_ResetStat_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_ResetStat_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                ResetStat.class, Builder.class);
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ResetStat)) {
                    return super.equals(obj);
                }
                ResetStat other = (ResetStat) obj;

                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static ResetStat parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static ResetStat parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static ResetStat parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static ResetStat parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static ResetStat parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static ResetStat parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static ResetStat parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static ResetStat parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static ResetStat parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static ResetStat parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static ResetStat parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static ResetStat parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(ResetStat prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * <pre>
             * Команда сброса статистики
             * </pre>
             *
             * Protobuf type {@code ResetStat}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:ResetStat)
                    ResetStatOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_ResetStat_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_ResetStat_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    ResetStat.class, Builder.class);
                }

                // Construct using ForpostServer.ResetStat.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_ResetStat_descriptor;
                }

                @Override
                public ResetStat getDefaultInstanceForType() {
                    return ResetStat.getDefaultInstance();
                }

                @Override
                public ResetStat build() {
                    ResetStat result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public ResetStat buildPartial() {
                    ResetStat result = new ResetStat(this);
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof ResetStat) {
                        return mergeFrom((ResetStat)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(ResetStat other) {
                    if (other == ResetStat.getDefaultInstance()) return this;
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    ResetStat parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (ResetStat) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:ResetStat)
            }

            // @@protoc_insertion_point(class_scope:ResetStat)
            private static final ResetStat DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new ResetStat();
            }

            public static ResetStat getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<ResetStat>
                    PARSER = new com.google.protobuf.AbstractParser<ResetStat>() {
                @Override
                public ResetStat parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new ResetStat(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<ResetStat> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<ResetStat> getParserForType() {
                return PARSER;
            }

            @Override
            public ResetStat getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface MilesCommandOrBuilder extends
                // @@protoc_insertion_point(interface_extends:MilesCommand)
                com.google.protobuf.MessageOrBuilder {

            /**
             * <pre>
             * Miles команда, которую комплекту необходимо применить
             * </pre>
             *
             * <code>int32 command = 1;</code>
             * @return The command.
             */
            int getCommand();
        }
        /**
         * <pre>
         * Miles команда
         * </pre>
         *
         * Protobuf type {@code MilesCommand}
         */
        public static final class MilesCommand extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:MilesCommand)
                MilesCommandOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use MilesCommand.newBuilder() to construct.
            private MilesCommand(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private MilesCommand() {
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new MilesCommand();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private MilesCommand(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            case 8: {

                                command_ = input.readInt32();
                                break;
                            }
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_MilesCommand_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_MilesCommand_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                MilesCommand.class, Builder.class);
            }

            public static final int COMMAND_FIELD_NUMBER = 1;
            private int command_;
            /**
             * <pre>
             * Miles команда, которую комплекту необходимо применить
             * </pre>
             *
             * <code>int32 command = 1;</code>
             * @return The command.
             */
            @Override
            public int getCommand() {
                return command_;
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                if (command_ != 0) {
                    output.writeInt32(1, command_);
                }
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                if (command_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(1, command_);
                }
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof MilesCommand)) {
                    return super.equals(obj);
                }
                MilesCommand other = (MilesCommand) obj;

                if (getCommand()
                        != other.getCommand()) return false;
                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                hash = (37 * hash) + COMMAND_FIELD_NUMBER;
                hash = (53 * hash) + getCommand();
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static MilesCommand parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static MilesCommand parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static MilesCommand parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static MilesCommand parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static MilesCommand parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static MilesCommand parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static MilesCommand parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static MilesCommand parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static MilesCommand parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static MilesCommand parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static MilesCommand parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static MilesCommand parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(MilesCommand prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * <pre>
             * Miles команда
             * </pre>
             *
             * Protobuf type {@code MilesCommand}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:MilesCommand)
                    MilesCommandOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_MilesCommand_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_MilesCommand_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    MilesCommand.class, Builder.class);
                }

                // Construct using ForpostServer.MilesCommand.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    command_ = 0;

                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_MilesCommand_descriptor;
                }

                @Override
                public MilesCommand getDefaultInstanceForType() {
                    return MilesCommand.getDefaultInstance();
                }

                @Override
                public MilesCommand build() {
                    MilesCommand result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public MilesCommand buildPartial() {
                    MilesCommand result = new MilesCommand(this);
                    result.command_ = command_;
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof MilesCommand) {
                        return mergeFrom((MilesCommand)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(MilesCommand other) {
                    if (other == MilesCommand.getDefaultInstance()) return this;
                    if (other.getCommand() != 0) {
                        setCommand(other.getCommand());
                    }
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    MilesCommand parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (MilesCommand) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }

                private int command_ ;
                /**
                 * <pre>
                 * Miles команда, которую комплекту необходимо применить
                 * </pre>
                 *
                 * <code>int32 command = 1;</code>
                 * @return The command.
                 */
                @Override
                public int getCommand() {
                    return command_;
                }
                /**
                 * <pre>
                 * Miles команда, которую комплекту необходимо применить
                 * </pre>
                 *
                 * <code>int32 command = 1;</code>
                 * @param value The command to set.
                 * @return This builder for chaining.
                 */
                public Builder setCommand(int value) {

                    command_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * Miles команда, которую комплекту необходимо применить
                 * </pre>
                 *
                 * <code>int32 command = 1;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearCommand() {

                    command_ = 0;
                    onChanged();
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:MilesCommand)
            }

            // @@protoc_insertion_point(class_scope:MilesCommand)
            private static final MilesCommand DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new MilesCommand();
            }

            public static MilesCommand getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<MilesCommand>
                    PARSER = new com.google.protobuf.AbstractParser<MilesCommand>() {
                @Override
                public MilesCommand parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new MilesCommand(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<MilesCommand> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<MilesCommand> getParserForType() {
                return PARSER;
            }

            @Override
            public MilesCommand getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface ReturnToDefSettingsOrBuilder extends
                // @@protoc_insertion_point(interface_extends:ReturnToDefSettings)
                com.google.protobuf.MessageOrBuilder {
        }
        /**
         * <pre>
         * Установка настроек по умолчанию
         * </pre>
         *
         * Protobuf type {@code ReturnToDefSettings}
         */
        public static final class ReturnToDefSettings extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:ReturnToDefSettings)
                ReturnToDefSettingsOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use ReturnToDefSettings.newBuilder() to construct.
            private ReturnToDefSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private ReturnToDefSettings() {
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new ReturnToDefSettings();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private ReturnToDefSettings(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_ReturnToDefSettings_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_ReturnToDefSettings_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                ReturnToDefSettings.class, Builder.class);
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ReturnToDefSettings)) {
                    return super.equals(obj);
                }
                ReturnToDefSettings other = (ReturnToDefSettings) obj;

                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static ReturnToDefSettings parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static ReturnToDefSettings parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static ReturnToDefSettings parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static ReturnToDefSettings parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static ReturnToDefSettings parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static ReturnToDefSettings parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static ReturnToDefSettings parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static ReturnToDefSettings parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static ReturnToDefSettings parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static ReturnToDefSettings parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static ReturnToDefSettings parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static ReturnToDefSettings parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(ReturnToDefSettings prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * <pre>
             * Установка настроек по умолчанию
             * </pre>
             *
             * Protobuf type {@code ReturnToDefSettings}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:ReturnToDefSettings)
                    ReturnToDefSettingsOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_ReturnToDefSettings_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_ReturnToDefSettings_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    ReturnToDefSettings.class, Builder.class);
                }

                // Construct using ForpostServer.ReturnToDefSettings.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_ReturnToDefSettings_descriptor;
                }

                @Override
                public ReturnToDefSettings getDefaultInstanceForType() {
                    return ReturnToDefSettings.getDefaultInstance();
                }

                @Override
                public ReturnToDefSettings build() {
                    ReturnToDefSettings result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public ReturnToDefSettings buildPartial() {
                    ReturnToDefSettings result = new ReturnToDefSettings(this);
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof ReturnToDefSettings) {
                        return mergeFrom((ReturnToDefSettings)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(ReturnToDefSettings other) {
                    if (other == ReturnToDefSettings.getDefaultInstance()) return this;
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    ReturnToDefSettings parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (ReturnToDefSettings) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:ReturnToDefSettings)
            }

            // @@protoc_insertion_point(class_scope:ReturnToDefSettings)
            private static final ReturnToDefSettings DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new ReturnToDefSettings();
            }

            public static ReturnToDefSettings getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<ReturnToDefSettings>
                    PARSER = new com.google.protobuf.AbstractParser<ReturnToDefSettings>() {
                @Override
                public ReturnToDefSettings parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new ReturnToDefSettings(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<ReturnToDefSettings> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<ReturnToDefSettings> getParserForType() {
                return PARSER;
            }

            @Override
            public ReturnToDefSettings getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface GetBatteryLevelOrBuilder extends
                // @@protoc_insertion_point(interface_extends:GetBatteryLevel)
                com.google.protobuf.MessageOrBuilder {
        }
        /**
         * <pre>
         *Запрос на получение заряда аккумулятора в % 0 -100
         * </pre>
         *
         * Protobuf type {@code GetBatteryLevel}
         */
        public static final class GetBatteryLevel extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:GetBatteryLevel)
                GetBatteryLevelOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use GetBatteryLevel.newBuilder() to construct.
            private GetBatteryLevel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private GetBatteryLevel() {
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new GetBatteryLevel();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private GetBatteryLevel(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_GetBatteryLevel_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_GetBatteryLevel_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                GetBatteryLevel.class, Builder.class);
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof GetBatteryLevel)) {
                    return super.equals(obj);
                }
                GetBatteryLevel other = (GetBatteryLevel) obj;

                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static GetBatteryLevel parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static GetBatteryLevel parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static GetBatteryLevel parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static GetBatteryLevel parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static GetBatteryLevel parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static GetBatteryLevel parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static GetBatteryLevel parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static GetBatteryLevel parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static GetBatteryLevel parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static GetBatteryLevel parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static GetBatteryLevel parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static GetBatteryLevel parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(GetBatteryLevel prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * <pre>
             *Запрос на получение заряда аккумулятора в % 0 -100
             * </pre>
             *
             * Protobuf type {@code GetBatteryLevel}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:GetBatteryLevel)
                    GetBatteryLevelOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_GetBatteryLevel_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_GetBatteryLevel_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    GetBatteryLevel.class, Builder.class);
                }

                // Construct using ForpostServer.GetBatteryLevel.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_GetBatteryLevel_descriptor;
                }

                @Override
                public GetBatteryLevel getDefaultInstanceForType() {
                    return GetBatteryLevel.getDefaultInstance();
                }

                @Override
                public GetBatteryLevel build() {
                    GetBatteryLevel result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public GetBatteryLevel buildPartial() {
                    GetBatteryLevel result = new GetBatteryLevel(this);
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof GetBatteryLevel) {
                        return mergeFrom((GetBatteryLevel)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(GetBatteryLevel other) {
                    if (other == GetBatteryLevel.getDefaultInstance()) return this;
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    GetBatteryLevel parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (GetBatteryLevel) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:GetBatteryLevel)
            }

            // @@protoc_insertion_point(class_scope:GetBatteryLevel)
            private static final GetBatteryLevel DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new GetBatteryLevel();
            }

            public static GetBatteryLevel getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<GetBatteryLevel>
                    PARSER = new com.google.protobuf.AbstractParser<GetBatteryLevel>() {
                @Override
                public GetBatteryLevel parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new GetBatteryLevel(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<GetBatteryLevel> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<GetBatteryLevel> getParserForType() {
                return PARSER;
            }

            @Override
            public GetBatteryLevel getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface ResponseBatteryLevelOrBuilder extends
                // @@protoc_insertion_point(interface_extends:ResponseBatteryLevel)
                com.google.protobuf.MessageOrBuilder {

            /**
             * <pre>
             *Основное устройство(тагер или доп.оборудование)
             * </pre>
             *
             * <code>int32 battery_level = 1 [deprecated = true];</code>
             * @return The batteryLevel.
             */
            @Deprecated int getBatteryLevel();

            /**
             * <pre>
             *заряд повязки
             * </pre>
             *
             * <code>int32 battery_level_bandage = 2 [deprecated = true];</code>
             * @return The batteryLevelBandage.
             */
            @Deprecated int getBatteryLevelBandage();

            /**
             * <pre>
             *уровни заряда слейвов
             * </pre>
             *
             * <code>repeated .KitBatteryLevel massBatLevl = 3;</code>
             */
            java.util.List<KitBatteryLevel>
            getMassBatLevlList();
            /**
             * <pre>
             *уровни заряда слейвов
             * </pre>
             *
             * <code>repeated .KitBatteryLevel massBatLevl = 3;</code>
             */
            KitBatteryLevel getMassBatLevl(int index);
            /**
             * <pre>
             *уровни заряда слейвов
             * </pre>
             *
             * <code>repeated .KitBatteryLevel massBatLevl = 3;</code>
             */
            int getMassBatLevlCount();
            /**
             * <pre>
             *уровни заряда слейвов
             * </pre>
             *
             * <code>repeated .KitBatteryLevel massBatLevl = 3;</code>
             */
            java.util.List<? extends KitBatteryLevelOrBuilder>
            getMassBatLevlOrBuilderList();
            /**
             * <pre>
             *уровни заряда слейвов
             * </pre>
             *
             * <code>repeated .KitBatteryLevel massBatLevl = 3;</code>
             */
            KitBatteryLevelOrBuilder getMassBatLevlOrBuilder(
                    int index);
        }
        /**
         * <pre>
         *Ответ на запрос заряда аккумулятора
         * </pre>
         *
         * Protobuf type {@code ResponseBatteryLevel}
         */
        public static final class ResponseBatteryLevel extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:ResponseBatteryLevel)
                ResponseBatteryLevelOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use ResponseBatteryLevel.newBuilder() to construct.
            private ResponseBatteryLevel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private ResponseBatteryLevel() {
                massBatLevl_ = java.util.Collections.emptyList();
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new ResponseBatteryLevel();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private ResponseBatteryLevel(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                int mutable_bitField0_ = 0;
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            case 8: {

                                batteryLevel_ = input.readInt32();
                                break;
                            }
                            case 16: {

                                batteryLevelBandage_ = input.readInt32();
                                break;
                            }
                            case 26: {
                                if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                    massBatLevl_ = new java.util.ArrayList<KitBatteryLevel>();
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                massBatLevl_.add(
                                        input.readMessage(KitBatteryLevel.parser(), extensionRegistry));
                                break;
                            }
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    if (((mutable_bitField0_ & 0x00000001) != 0)) {
                        massBatLevl_ = java.util.Collections.unmodifiableList(massBatLevl_);
                    }
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_ResponseBatteryLevel_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_ResponseBatteryLevel_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                ResponseBatteryLevel.class, Builder.class);
            }

            public static final int BATTERY_LEVEL_FIELD_NUMBER = 1;
            private int batteryLevel_;
            /**
             * <pre>
             *Основное устройство(тагер или доп.оборудование)
             * </pre>
             *
             * <code>int32 battery_level = 1 [deprecated = true];</code>
             * @return The batteryLevel.
             */
            @Override
            @Deprecated public int getBatteryLevel() {
                return batteryLevel_;
            }

            public static final int BATTERY_LEVEL_BANDAGE_FIELD_NUMBER = 2;
            private int batteryLevelBandage_;
            /**
             * <pre>
             *заряд повязки
             * </pre>
             *
             * <code>int32 battery_level_bandage = 2 [deprecated = true];</code>
             * @return The batteryLevelBandage.
             */
            @Override
            @Deprecated public int getBatteryLevelBandage() {
                return batteryLevelBandage_;
            }

            public static final int MASSBATLEVL_FIELD_NUMBER = 3;
            private java.util.List<KitBatteryLevel> massBatLevl_;
            /**
             * <pre>
             *уровни заряда слейвов
             * </pre>
             *
             * <code>repeated .KitBatteryLevel massBatLevl = 3;</code>
             */
            @Override
            public java.util.List<KitBatteryLevel> getMassBatLevlList() {
                return massBatLevl_;
            }
            /**
             * <pre>
             *уровни заряда слейвов
             * </pre>
             *
             * <code>repeated .KitBatteryLevel massBatLevl = 3;</code>
             */
            @Override
            public java.util.List<? extends KitBatteryLevelOrBuilder>
            getMassBatLevlOrBuilderList() {
                return massBatLevl_;
            }
            /**
             * <pre>
             *уровни заряда слейвов
             * </pre>
             *
             * <code>repeated .KitBatteryLevel massBatLevl = 3;</code>
             */
            @Override
            public int getMassBatLevlCount() {
                return massBatLevl_.size();
            }
            /**
             * <pre>
             *уровни заряда слейвов
             * </pre>
             *
             * <code>repeated .KitBatteryLevel massBatLevl = 3;</code>
             */
            @Override
            public KitBatteryLevel getMassBatLevl(int index) {
                return massBatLevl_.get(index);
            }
            /**
             * <pre>
             *уровни заряда слейвов
             * </pre>
             *
             * <code>repeated .KitBatteryLevel massBatLevl = 3;</code>
             */
            @Override
            public KitBatteryLevelOrBuilder getMassBatLevlOrBuilder(
                    int index) {
                return massBatLevl_.get(index);
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                if (batteryLevel_ != 0) {
                    output.writeInt32(1, batteryLevel_);
                }
                if (batteryLevelBandage_ != 0) {
                    output.writeInt32(2, batteryLevelBandage_);
                }
                for (int i = 0; i < massBatLevl_.size(); i++) {
                    output.writeMessage(3, massBatLevl_.get(i));
                }
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                if (batteryLevel_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(1, batteryLevel_);
                }
                if (batteryLevelBandage_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(2, batteryLevelBandage_);
                }
                for (int i = 0; i < massBatLevl_.size(); i++) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeMessageSize(3, massBatLevl_.get(i));
                }
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ResponseBatteryLevel)) {
                    return super.equals(obj);
                }
                ResponseBatteryLevel other = (ResponseBatteryLevel) obj;

                if (getBatteryLevel()
                        != other.getBatteryLevel()) return false;
                if (getBatteryLevelBandage()
                        != other.getBatteryLevelBandage()) return false;
                if (!getMassBatLevlList()
                        .equals(other.getMassBatLevlList())) return false;
                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                hash = (37 * hash) + BATTERY_LEVEL_FIELD_NUMBER;
                hash = (53 * hash) + getBatteryLevel();
                hash = (37 * hash) + BATTERY_LEVEL_BANDAGE_FIELD_NUMBER;
                hash = (53 * hash) + getBatteryLevelBandage();
                if (getMassBatLevlCount() > 0) {
                    hash = (37 * hash) + MASSBATLEVL_FIELD_NUMBER;
                    hash = (53 * hash) + getMassBatLevlList().hashCode();
                }
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static ResponseBatteryLevel parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static ResponseBatteryLevel parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static ResponseBatteryLevel parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static ResponseBatteryLevel parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static ResponseBatteryLevel parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static ResponseBatteryLevel parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static ResponseBatteryLevel parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static ResponseBatteryLevel parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static ResponseBatteryLevel parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static ResponseBatteryLevel parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static ResponseBatteryLevel parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static ResponseBatteryLevel parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(ResponseBatteryLevel prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * <pre>
             *Ответ на запрос заряда аккумулятора
             * </pre>
             *
             * Protobuf type {@code ResponseBatteryLevel}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:ResponseBatteryLevel)
                    ResponseBatteryLevelOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_ResponseBatteryLevel_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_ResponseBatteryLevel_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    ResponseBatteryLevel.class, Builder.class);
                }

                // Construct using ForpostServer.ResponseBatteryLevel.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                        getMassBatLevlFieldBuilder();
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    batteryLevel_ = 0;

                    batteryLevelBandage_ = 0;

                    if (massBatLevlBuilder_ == null) {
                        massBatLevl_ = java.util.Collections.emptyList();
                        bitField0_ = (bitField0_ & ~0x00000001);
                    } else {
                        massBatLevlBuilder_.clear();
                    }
                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_ResponseBatteryLevel_descriptor;
                }

                @Override
                public ResponseBatteryLevel getDefaultInstanceForType() {
                    return ResponseBatteryLevel.getDefaultInstance();
                }

                @Override
                public ResponseBatteryLevel build() {
                    ResponseBatteryLevel result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public ResponseBatteryLevel buildPartial() {
                    ResponseBatteryLevel result = new ResponseBatteryLevel(this);
                    int from_bitField0_ = bitField0_;
                    result.batteryLevel_ = batteryLevel_;
                    result.batteryLevelBandage_ = batteryLevelBandage_;
                    if (massBatLevlBuilder_ == null) {
                        if (((bitField0_ & 0x00000001) != 0)) {
                            massBatLevl_ = java.util.Collections.unmodifiableList(massBatLevl_);
                            bitField0_ = (bitField0_ & ~0x00000001);
                        }
                        result.massBatLevl_ = massBatLevl_;
                    } else {
                        result.massBatLevl_ = massBatLevlBuilder_.build();
                    }
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof ResponseBatteryLevel) {
                        return mergeFrom((ResponseBatteryLevel)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(ResponseBatteryLevel other) {
                    if (other == ResponseBatteryLevel.getDefaultInstance()) return this;
                    if (other.getBatteryLevel() != 0) {
                        setBatteryLevel(other.getBatteryLevel());
                    }
                    if (other.getBatteryLevelBandage() != 0) {
                        setBatteryLevelBandage(other.getBatteryLevelBandage());
                    }
                    if (massBatLevlBuilder_ == null) {
                        if (!other.massBatLevl_.isEmpty()) {
                            if (massBatLevl_.isEmpty()) {
                                massBatLevl_ = other.massBatLevl_;
                                bitField0_ = (bitField0_ & ~0x00000001);
                            } else {
                                ensureMassBatLevlIsMutable();
                                massBatLevl_.addAll(other.massBatLevl_);
                            }
                            onChanged();
                        }
                    } else {
                        if (!other.massBatLevl_.isEmpty()) {
                            if (massBatLevlBuilder_.isEmpty()) {
                                massBatLevlBuilder_.dispose();
                                massBatLevlBuilder_ = null;
                                massBatLevl_ = other.massBatLevl_;
                                bitField0_ = (bitField0_ & ~0x00000001);
                                massBatLevlBuilder_ =
                                        com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                                getMassBatLevlFieldBuilder() : null;
                            } else {
                                massBatLevlBuilder_.addAllMessages(other.massBatLevl_);
                            }
                        }
                    }
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    ResponseBatteryLevel parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (ResponseBatteryLevel) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                private int bitField0_;

                private int batteryLevel_ ;
                /**
                 * <pre>
                 *Основное устройство(тагер или доп.оборудование)
                 * </pre>
                 *
                 * <code>int32 battery_level = 1 [deprecated = true];</code>
                 * @return The batteryLevel.
                 */
                @Override
                @Deprecated public int getBatteryLevel() {
                    return batteryLevel_;
                }
                /**
                 * <pre>
                 *Основное устройство(тагер или доп.оборудование)
                 * </pre>
                 *
                 * <code>int32 battery_level = 1 [deprecated = true];</code>
                 * @param value The batteryLevel to set.
                 * @return This builder for chaining.
                 */
                @Deprecated public Builder setBatteryLevel(int value) {

                    batteryLevel_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 *Основное устройство(тагер или доп.оборудование)
                 * </pre>
                 *
                 * <code>int32 battery_level = 1 [deprecated = true];</code>
                 * @return This builder for chaining.
                 */
                @Deprecated public Builder clearBatteryLevel() {

                    batteryLevel_ = 0;
                    onChanged();
                    return this;
                }

                private int batteryLevelBandage_ ;
                /**
                 * <pre>
                 *заряд повязки
                 * </pre>
                 *
                 * <code>int32 battery_level_bandage = 2 [deprecated = true];</code>
                 * @return The batteryLevelBandage.
                 */
                @Override
                @Deprecated public int getBatteryLevelBandage() {
                    return batteryLevelBandage_;
                }
                /**
                 * <pre>
                 *заряд повязки
                 * </pre>
                 *
                 * <code>int32 battery_level_bandage = 2 [deprecated = true];</code>
                 * @param value The batteryLevelBandage to set.
                 * @return This builder for chaining.
                 */
                @Deprecated public Builder setBatteryLevelBandage(int value) {

                    batteryLevelBandage_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 *заряд повязки
                 * </pre>
                 *
                 * <code>int32 battery_level_bandage = 2 [deprecated = true];</code>
                 * @return This builder for chaining.
                 */
                @Deprecated public Builder clearBatteryLevelBandage() {

                    batteryLevelBandage_ = 0;
                    onChanged();
                    return this;
                }

                private java.util.List<KitBatteryLevel> massBatLevl_ =
                        java.util.Collections.emptyList();
                private void ensureMassBatLevlIsMutable() {
                    if (!((bitField0_ & 0x00000001) != 0)) {
                        massBatLevl_ = new java.util.ArrayList<KitBatteryLevel>(massBatLevl_);
                        bitField0_ |= 0x00000001;
                    }
                }

                private com.google.protobuf.RepeatedFieldBuilderV3<
                        KitBatteryLevel, KitBatteryLevel.Builder, KitBatteryLevelOrBuilder> massBatLevlBuilder_;

                /**
                 * <pre>
                 *уровни заряда слейвов
                 * </pre>
                 *
                 * <code>repeated .KitBatteryLevel massBatLevl = 3;</code>
                 */
                public java.util.List<KitBatteryLevel> getMassBatLevlList() {
                    if (massBatLevlBuilder_ == null) {
                        return java.util.Collections.unmodifiableList(massBatLevl_);
                    } else {
                        return massBatLevlBuilder_.getMessageList();
                    }
                }
                /**
                 * <pre>
                 *уровни заряда слейвов
                 * </pre>
                 *
                 * <code>repeated .KitBatteryLevel massBatLevl = 3;</code>
                 */
                public int getMassBatLevlCount() {
                    if (massBatLevlBuilder_ == null) {
                        return massBatLevl_.size();
                    } else {
                        return massBatLevlBuilder_.getCount();
                    }
                }
                /**
                 * <pre>
                 *уровни заряда слейвов
                 * </pre>
                 *
                 * <code>repeated .KitBatteryLevel massBatLevl = 3;</code>
                 */
                public KitBatteryLevel getMassBatLevl(int index) {
                    if (massBatLevlBuilder_ == null) {
                        return massBatLevl_.get(index);
                    } else {
                        return massBatLevlBuilder_.getMessage(index);
                    }
                }
                /**
                 * <pre>
                 *уровни заряда слейвов
                 * </pre>
                 *
                 * <code>repeated .KitBatteryLevel massBatLevl = 3;</code>
                 */
                public Builder setMassBatLevl(
                        int index, KitBatteryLevel value) {
                    if (massBatLevlBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureMassBatLevlIsMutable();
                        massBatLevl_.set(index, value);
                        onChanged();
                    } else {
                        massBatLevlBuilder_.setMessage(index, value);
                    }
                    return this;
                }
                /**
                 * <pre>
                 *уровни заряда слейвов
                 * </pre>
                 *
                 * <code>repeated .KitBatteryLevel massBatLevl = 3;</code>
                 */
                public Builder setMassBatLevl(
                        int index, KitBatteryLevel.Builder builderForValue) {
                    if (massBatLevlBuilder_ == null) {
                        ensureMassBatLevlIsMutable();
                        massBatLevl_.set(index, builderForValue.build());
                        onChanged();
                    } else {
                        massBatLevlBuilder_.setMessage(index, builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <pre>
                 *уровни заряда слейвов
                 * </pre>
                 *
                 * <code>repeated .KitBatteryLevel massBatLevl = 3;</code>
                 */
                public Builder addMassBatLevl(KitBatteryLevel value) {
                    if (massBatLevlBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureMassBatLevlIsMutable();
                        massBatLevl_.add(value);
                        onChanged();
                    } else {
                        massBatLevlBuilder_.addMessage(value);
                    }
                    return this;
                }
                /**
                 * <pre>
                 *уровни заряда слейвов
                 * </pre>
                 *
                 * <code>repeated .KitBatteryLevel massBatLevl = 3;</code>
                 */
                public Builder addMassBatLevl(
                        int index, KitBatteryLevel value) {
                    if (massBatLevlBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureMassBatLevlIsMutable();
                        massBatLevl_.add(index, value);
                        onChanged();
                    } else {
                        massBatLevlBuilder_.addMessage(index, value);
                    }
                    return this;
                }
                /**
                 * <pre>
                 *уровни заряда слейвов
                 * </pre>
                 *
                 * <code>repeated .KitBatteryLevel massBatLevl = 3;</code>
                 */
                public Builder addMassBatLevl(
                        KitBatteryLevel.Builder builderForValue) {
                    if (massBatLevlBuilder_ == null) {
                        ensureMassBatLevlIsMutable();
                        massBatLevl_.add(builderForValue.build());
                        onChanged();
                    } else {
                        massBatLevlBuilder_.addMessage(builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <pre>
                 *уровни заряда слейвов
                 * </pre>
                 *
                 * <code>repeated .KitBatteryLevel massBatLevl = 3;</code>
                 */
                public Builder addMassBatLevl(
                        int index, KitBatteryLevel.Builder builderForValue) {
                    if (massBatLevlBuilder_ == null) {
                        ensureMassBatLevlIsMutable();
                        massBatLevl_.add(index, builderForValue.build());
                        onChanged();
                    } else {
                        massBatLevlBuilder_.addMessage(index, builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <pre>
                 *уровни заряда слейвов
                 * </pre>
                 *
                 * <code>repeated .KitBatteryLevel massBatLevl = 3;</code>
                 */
                public Builder addAllMassBatLevl(
                        Iterable<? extends KitBatteryLevel> values) {
                    if (massBatLevlBuilder_ == null) {
                        ensureMassBatLevlIsMutable();
                        com.google.protobuf.AbstractMessageLite.Builder.addAll(
                                values, massBatLevl_);
                        onChanged();
                    } else {
                        massBatLevlBuilder_.addAllMessages(values);
                    }
                    return this;
                }
                /**
                 * <pre>
                 *уровни заряда слейвов
                 * </pre>
                 *
                 * <code>repeated .KitBatteryLevel massBatLevl = 3;</code>
                 */
                public Builder clearMassBatLevl() {
                    if (massBatLevlBuilder_ == null) {
                        massBatLevl_ = java.util.Collections.emptyList();
                        bitField0_ = (bitField0_ & ~0x00000001);
                        onChanged();
                    } else {
                        massBatLevlBuilder_.clear();
                    }
                    return this;
                }
                /**
                 * <pre>
                 *уровни заряда слейвов
                 * </pre>
                 *
                 * <code>repeated .KitBatteryLevel massBatLevl = 3;</code>
                 */
                public Builder removeMassBatLevl(int index) {
                    if (massBatLevlBuilder_ == null) {
                        ensureMassBatLevlIsMutable();
                        massBatLevl_.remove(index);
                        onChanged();
                    } else {
                        massBatLevlBuilder_.remove(index);
                    }
                    return this;
                }
                /**
                 * <pre>
                 *уровни заряда слейвов
                 * </pre>
                 *
                 * <code>repeated .KitBatteryLevel massBatLevl = 3;</code>
                 */
                public KitBatteryLevel.Builder getMassBatLevlBuilder(
                        int index) {
                    return getMassBatLevlFieldBuilder().getBuilder(index);
                }
                /**
                 * <pre>
                 *уровни заряда слейвов
                 * </pre>
                 *
                 * <code>repeated .KitBatteryLevel massBatLevl = 3;</code>
                 */
                public KitBatteryLevelOrBuilder getMassBatLevlOrBuilder(
                        int index) {
                    if (massBatLevlBuilder_ == null) {
                        return massBatLevl_.get(index);  } else {
                        return massBatLevlBuilder_.getMessageOrBuilder(index);
                    }
                }
                /**
                 * <pre>
                 *уровни заряда слейвов
                 * </pre>
                 *
                 * <code>repeated .KitBatteryLevel massBatLevl = 3;</code>
                 */
                public java.util.List<? extends KitBatteryLevelOrBuilder>
                getMassBatLevlOrBuilderList() {
                    if (massBatLevlBuilder_ != null) {
                        return massBatLevlBuilder_.getMessageOrBuilderList();
                    } else {
                        return java.util.Collections.unmodifiableList(massBatLevl_);
                    }
                }
                /**
                 * <pre>
                 *уровни заряда слейвов
                 * </pre>
                 *
                 * <code>repeated .KitBatteryLevel massBatLevl = 3;</code>
                 */
                public KitBatteryLevel.Builder addMassBatLevlBuilder() {
                    return getMassBatLevlFieldBuilder().addBuilder(
                            KitBatteryLevel.getDefaultInstance());
                }
                /**
                 * <pre>
                 *уровни заряда слейвов
                 * </pre>
                 *
                 * <code>repeated .KitBatteryLevel massBatLevl = 3;</code>
                 */
                public KitBatteryLevel.Builder addMassBatLevlBuilder(
                        int index) {
                    return getMassBatLevlFieldBuilder().addBuilder(
                            index, KitBatteryLevel.getDefaultInstance());
                }
                /**
                 * <pre>
                 *уровни заряда слейвов
                 * </pre>
                 *
                 * <code>repeated .KitBatteryLevel massBatLevl = 3;</code>
                 */
                public java.util.List<KitBatteryLevel.Builder>
                getMassBatLevlBuilderList() {
                    return getMassBatLevlFieldBuilder().getBuilderList();
                }
                private com.google.protobuf.RepeatedFieldBuilderV3<
                        KitBatteryLevel, KitBatteryLevel.Builder, KitBatteryLevelOrBuilder>
                getMassBatLevlFieldBuilder() {
                    if (massBatLevlBuilder_ == null) {
                        massBatLevlBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                                KitBatteryLevel, KitBatteryLevel.Builder, KitBatteryLevelOrBuilder>(
                                massBatLevl_,
                                ((bitField0_ & 0x00000001) != 0),
                                getParentForChildren(),
                                isClean());
                        massBatLevl_ = null;
                    }
                    return massBatLevlBuilder_;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:ResponseBatteryLevel)
            }

            // @@protoc_insertion_point(class_scope:ResponseBatteryLevel)
            private static final ResponseBatteryLevel DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new ResponseBatteryLevel();
            }

            public static ResponseBatteryLevel getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<ResponseBatteryLevel>
                    PARSER = new com.google.protobuf.AbstractParser<ResponseBatteryLevel>() {
                @Override
                public ResponseBatteryLevel parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new ResponseBatteryLevel(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<ResponseBatteryLevel> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<ResponseBatteryLevel> getParserForType() {
                return PARSER;
            }

            @Override
            public ResponseBatteryLevel getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface SetBrightnesOrBuilder extends
                // @@protoc_insertion_point(interface_extends:SetBrightnes)
                com.google.protobuf.MessageOrBuilder {

            /**
             * <code>int32 set_diodes_brightnes = 1;</code>
             * @return The setDiodesBrightnes.
             */
            int getSetDiodesBrightnes();

            /**
             * <code>int32 set_display_brightness = 2;</code>
             * @return The setDisplayBrightness.
             */
            int getSetDisplayBrightness();

            /**
             * <pre>
             * Уникальное UUID устройства. Посылается серверу в сообщении SendSlavesInfoResponce (структура SlaveInfo поле dev_id)
             * </pre>
             *
             * <code>int32 dev_id = 3;</code>
             * @return The devId.
             */
            int getDevId();
        }
        /**
         * <pre>
         *Установка яркости светодиодов в % 0 -100
         * </pre>
         *
         * Protobuf type {@code SetBrightnes}
         */
        public static final class SetBrightnes extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:SetBrightnes)
                SetBrightnesOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use SetBrightnes.newBuilder() to construct.
            private SetBrightnes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private SetBrightnes() {
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new SetBrightnes();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private SetBrightnes(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            case 8: {

                                setDiodesBrightnes_ = input.readInt32();
                                break;
                            }
                            case 16: {

                                setDisplayBrightness_ = input.readInt32();
                                break;
                            }
                            case 24: {

                                devId_ = input.readInt32();
                                break;
                            }
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_SetBrightnes_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_SetBrightnes_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SetBrightnes.class, Builder.class);
            }

            public static final int SET_DIODES_BRIGHTNES_FIELD_NUMBER = 1;
            private int setDiodesBrightnes_;
            /**
             * <code>int32 set_diodes_brightnes = 1;</code>
             * @return The setDiodesBrightnes.
             */
            @Override
            public int getSetDiodesBrightnes() {
                return setDiodesBrightnes_;
            }

            public static final int SET_DISPLAY_BRIGHTNESS_FIELD_NUMBER = 2;
            private int setDisplayBrightness_;
            /**
             * <code>int32 set_display_brightness = 2;</code>
             * @return The setDisplayBrightness.
             */
            @Override
            public int getSetDisplayBrightness() {
                return setDisplayBrightness_;
            }

            public static final int DEV_ID_FIELD_NUMBER = 3;
            private int devId_;
            /**
             * <pre>
             * Уникальное UUID устройства. Посылается серверу в сообщении SendSlavesInfoResponce (структура SlaveInfo поле dev_id)
             * </pre>
             *
             * <code>int32 dev_id = 3;</code>
             * @return The devId.
             */
            @Override
            public int getDevId() {
                return devId_;
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                if (setDiodesBrightnes_ != 0) {
                    output.writeInt32(1, setDiodesBrightnes_);
                }
                if (setDisplayBrightness_ != 0) {
                    output.writeInt32(2, setDisplayBrightness_);
                }
                if (devId_ != 0) {
                    output.writeInt32(3, devId_);
                }
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                if (setDiodesBrightnes_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(1, setDiodesBrightnes_);
                }
                if (setDisplayBrightness_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(2, setDisplayBrightness_);
                }
                if (devId_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(3, devId_);
                }
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SetBrightnes)) {
                    return super.equals(obj);
                }
                SetBrightnes other = (SetBrightnes) obj;

                if (getSetDiodesBrightnes()
                        != other.getSetDiodesBrightnes()) return false;
                if (getSetDisplayBrightness()
                        != other.getSetDisplayBrightness()) return false;
                if (getDevId()
                        != other.getDevId()) return false;
                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                hash = (37 * hash) + SET_DIODES_BRIGHTNES_FIELD_NUMBER;
                hash = (53 * hash) + getSetDiodesBrightnes();
                hash = (37 * hash) + SET_DISPLAY_BRIGHTNESS_FIELD_NUMBER;
                hash = (53 * hash) + getSetDisplayBrightness();
                hash = (37 * hash) + DEV_ID_FIELD_NUMBER;
                hash = (53 * hash) + getDevId();
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static SetBrightnes parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SetBrightnes parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SetBrightnes parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SetBrightnes parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SetBrightnes parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SetBrightnes parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SetBrightnes parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static SetBrightnes parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static SetBrightnes parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static SetBrightnes parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static SetBrightnes parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static SetBrightnes parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(SetBrightnes prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * <pre>
             *Установка яркости светодиодов в % 0 -100
             * </pre>
             *
             * Protobuf type {@code SetBrightnes}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:SetBrightnes)
                    SetBrightnesOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_SetBrightnes_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_SetBrightnes_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    SetBrightnes.class, Builder.class);
                }

                // Construct using ForpostServer.SetBrightnes.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    setDiodesBrightnes_ = 0;

                    setDisplayBrightness_ = 0;

                    devId_ = 0;

                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_SetBrightnes_descriptor;
                }

                @Override
                public SetBrightnes getDefaultInstanceForType() {
                    return SetBrightnes.getDefaultInstance();
                }

                @Override
                public SetBrightnes build() {
                    SetBrightnes result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public SetBrightnes buildPartial() {
                    SetBrightnes result = new SetBrightnes(this);
                    result.setDiodesBrightnes_ = setDiodesBrightnes_;
                    result.setDisplayBrightness_ = setDisplayBrightness_;
                    result.devId_ = devId_;
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof SetBrightnes) {
                        return mergeFrom((SetBrightnes)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(SetBrightnes other) {
                    if (other == SetBrightnes.getDefaultInstance()) return this;
                    if (other.getSetDiodesBrightnes() != 0) {
                        setSetDiodesBrightnes(other.getSetDiodesBrightnes());
                    }
                    if (other.getSetDisplayBrightness() != 0) {
                        setSetDisplayBrightness(other.getSetDisplayBrightness());
                    }
                    if (other.getDevId() != 0) {
                        setDevId(other.getDevId());
                    }
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    SetBrightnes parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (SetBrightnes) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }

                private int setDiodesBrightnes_ ;
                /**
                 * <code>int32 set_diodes_brightnes = 1;</code>
                 * @return The setDiodesBrightnes.
                 */
                @Override
                public int getSetDiodesBrightnes() {
                    return setDiodesBrightnes_;
                }
                /**
                 * <code>int32 set_diodes_brightnes = 1;</code>
                 * @param value The setDiodesBrightnes to set.
                 * @return This builder for chaining.
                 */
                public Builder setSetDiodesBrightnes(int value) {

                    setDiodesBrightnes_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>int32 set_diodes_brightnes = 1;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearSetDiodesBrightnes() {

                    setDiodesBrightnes_ = 0;
                    onChanged();
                    return this;
                }

                private int setDisplayBrightness_ ;
                /**
                 * <code>int32 set_display_brightness = 2;</code>
                 * @return The setDisplayBrightness.
                 */
                @Override
                public int getSetDisplayBrightness() {
                    return setDisplayBrightness_;
                }
                /**
                 * <code>int32 set_display_brightness = 2;</code>
                 * @param value The setDisplayBrightness to set.
                 * @return This builder for chaining.
                 */
                public Builder setSetDisplayBrightness(int value) {

                    setDisplayBrightness_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>int32 set_display_brightness = 2;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearSetDisplayBrightness() {

                    setDisplayBrightness_ = 0;
                    onChanged();
                    return this;
                }

                private int devId_ ;
                /**
                 * <pre>
                 * Уникальное UUID устройства. Посылается серверу в сообщении SendSlavesInfoResponce (структура SlaveInfo поле dev_id)
                 * </pre>
                 *
                 * <code>int32 dev_id = 3;</code>
                 * @return The devId.
                 */
                @Override
                public int getDevId() {
                    return devId_;
                }
                /**
                 * <pre>
                 * Уникальное UUID устройства. Посылается серверу в сообщении SendSlavesInfoResponce (структура SlaveInfo поле dev_id)
                 * </pre>
                 *
                 * <code>int32 dev_id = 3;</code>
                 * @param value The devId to set.
                 * @return This builder for chaining.
                 */
                public Builder setDevId(int value) {

                    devId_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * Уникальное UUID устройства. Посылается серверу в сообщении SendSlavesInfoResponce (структура SlaveInfo поле dev_id)
                 * </pre>
                 *
                 * <code>int32 dev_id = 3;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearDevId() {

                    devId_ = 0;
                    onChanged();
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:SetBrightnes)
            }

            // @@protoc_insertion_point(class_scope:SetBrightnes)
            private static final SetBrightnes DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new SetBrightnes();
            }

            public static SetBrightnes getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<SetBrightnes>
                    PARSER = new com.google.protobuf.AbstractParser<SetBrightnes>() {
                @Override
                public SetBrightnes parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new SetBrightnes(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<SetBrightnes> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<SetBrightnes> getParserForType() {
                return PARSER;
            }

            @Override
            public SetBrightnes getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface ErrorOrBuilder extends
                // @@protoc_insertion_point(interface_extends:Error)
                com.google.protobuf.MessageOrBuilder {

            /**
             * <code>.ErrorType errMessage = 1;</code>
             * @return The enum numeric value on the wire for errMessage.
             */
            int getErrMessageValue();
            /**
             * <code>.ErrorType errMessage = 1;</code>
             * @return The errMessage.
             */
            ErrorType getErrMessage();
        }
        /**
         * <pre>
         *Сообщение ошибки
         * </pre>
         *
         * Protobuf type {@code Error}
         */
        public static final class Error extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:Error)
                ErrorOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use Error.newBuilder() to construct.
            private Error(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private Error() {
                errMessage_ = 0;
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new Error();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private Error(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            case 8: {
                                int rawValue = input.readEnum();

                                errMessage_ = rawValue;
                                break;
                            }
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_Error_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_Error_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Error.class, Builder.class);
            }

            public static final int ERRMESSAGE_FIELD_NUMBER = 1;
            private int errMessage_;
            /**
             * <code>.ErrorType errMessage = 1;</code>
             * @return The enum numeric value on the wire for errMessage.
             */
            @Override public int getErrMessageValue() {
                return errMessage_;
            }
            /**
             * <code>.ErrorType errMessage = 1;</code>
             * @return The errMessage.
             */
            @Override public ErrorType getErrMessage() {
                @SuppressWarnings("deprecation")
                ErrorType result = ErrorType.valueOf(errMessage_);
                return result == null ? ErrorType.UNRECOGNIZED : result;
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                if (errMessage_ != ErrorType.e_UNKNOWN.getNumber()) {
                    output.writeEnum(1, errMessage_);
                }
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                if (errMessage_ != ErrorType.e_UNKNOWN.getNumber()) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeEnumSize(1, errMessage_);
                }
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return super.equals(obj);
                }
                Error other = (Error) obj;

                if (errMessage_ != other.errMessage_) return false;
                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                hash = (37 * hash) + ERRMESSAGE_FIELD_NUMBER;
                hash = (53 * hash) + errMessage_;
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static Error parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Error parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Error parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Error parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Error parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Error parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Error parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static Error parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static Error parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static Error parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static Error parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static Error parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(Error prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * <pre>
             *Сообщение ошибки
             * </pre>
             *
             * Protobuf type {@code Error}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:Error)
                    ErrorOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_Error_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_Error_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    Error.class, Builder.class);
                }

                // Construct using ForpostServer.Error.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    errMessage_ = 0;

                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_Error_descriptor;
                }

                @Override
                public Error getDefaultInstanceForType() {
                    return Error.getDefaultInstance();
                }

                @Override
                public Error build() {
                    Error result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public Error buildPartial() {
                    Error result = new Error(this);
                    result.errMessage_ = errMessage_;
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof Error) {
                        return mergeFrom((Error)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(Error other) {
                    if (other == Error.getDefaultInstance()) return this;
                    if (other.errMessage_ != 0) {
                        setErrMessageValue(other.getErrMessageValue());
                    }
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    Error parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (Error) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }

                private int errMessage_ = 0;
                /**
                 * <code>.ErrorType errMessage = 1;</code>
                 * @return The enum numeric value on the wire for errMessage.
                 */
                @Override public int getErrMessageValue() {
                    return errMessage_;
                }
                /**
                 * <code>.ErrorType errMessage = 1;</code>
                 * @param value The enum numeric value on the wire for errMessage to set.
                 * @return This builder for chaining.
                 */
                public Builder setErrMessageValue(int value) {

                    errMessage_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>.ErrorType errMessage = 1;</code>
                 * @return The errMessage.
                 */
                @Override
                public ErrorType getErrMessage() {
                    @SuppressWarnings("deprecation")
                    ErrorType result = ErrorType.valueOf(errMessage_);
                    return result == null ? ErrorType.UNRECOGNIZED : result;
                }
                /**
                 * <code>.ErrorType errMessage = 1;</code>
                 * @param value The errMessage to set.
                 * @return This builder for chaining.
                 */
                public Builder setErrMessage(ErrorType value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    errMessage_ = value.getNumber();
                    onChanged();
                    return this;
                }
                /**
                 * <code>.ErrorType errMessage = 1;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearErrMessage() {

                    errMessage_ = 0;
                    onChanged();
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:Error)
            }

            // @@protoc_insertion_point(class_scope:Error)
            private static final Error DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new Error();
            }

            public static Error getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<Error>
                    PARSER = new com.google.protobuf.AbstractParser<Error>() {
                @Override
                public Error parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new Error(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<Error> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<Error> getParserForType() {
                return PARSER;
            }

            @Override
            public Error getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface UpdateDevOrBuilder extends
                // @@protoc_insertion_point(interface_extends:UpdateDev)
                com.google.protobuf.MessageOrBuilder {
        }
        /**
         * <pre>
         *Команда устройству для перехода в режим обновления
         * </pre>
         *
         * Protobuf type {@code UpdateDev}
         */
        public static final class UpdateDev extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:UpdateDev)
                UpdateDevOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use UpdateDev.newBuilder() to construct.
            private UpdateDev(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private UpdateDev() {
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new UpdateDev();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private UpdateDev(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_UpdateDev_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_UpdateDev_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                UpdateDev.class, Builder.class);
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof UpdateDev)) {
                    return super.equals(obj);
                }
                UpdateDev other = (UpdateDev) obj;

                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static UpdateDev parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static UpdateDev parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static UpdateDev parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static UpdateDev parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static UpdateDev parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static UpdateDev parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static UpdateDev parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static UpdateDev parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static UpdateDev parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static UpdateDev parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static UpdateDev parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static UpdateDev parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(UpdateDev prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * <pre>
             *Команда устройству для перехода в режим обновления
             * </pre>
             *
             * Protobuf type {@code UpdateDev}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:UpdateDev)
                    UpdateDevOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_UpdateDev_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_UpdateDev_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    UpdateDev.class, Builder.class);
                }

                // Construct using ForpostServer.UpdateDev.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_UpdateDev_descriptor;
                }

                @Override
                public UpdateDev getDefaultInstanceForType() {
                    return UpdateDev.getDefaultInstance();
                }

                @Override
                public UpdateDev build() {
                    UpdateDev result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public UpdateDev buildPartial() {
                    UpdateDev result = new UpdateDev(this);
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof UpdateDev) {
                        return mergeFrom((UpdateDev)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(UpdateDev other) {
                    if (other == UpdateDev.getDefaultInstance()) return this;
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    UpdateDev parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (UpdateDev) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:UpdateDev)
            }

            // @@protoc_insertion_point(class_scope:UpdateDev)
            private static final UpdateDev DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new UpdateDev();
            }

            public static UpdateDev getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<UpdateDev>
                    PARSER = new com.google.protobuf.AbstractParser<UpdateDev>() {
                @Override
                public UpdateDev parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new UpdateDev(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<UpdateDev> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<UpdateDev> getParserForType() {
                return PARSER;
            }

            @Override
            public UpdateDev getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface setLanguageOrBuilder extends
                // @@protoc_insertion_point(interface_extends:setLanguage)
                com.google.protobuf.MessageOrBuilder {

            /**
             * <code>.LangugeType language = 1;</code>
             * @return The enum numeric value on the wire for language.
             */
            int getLanguageValue();
            /**
             * <code>.LangugeType language = 1;</code>
             * @return The language.
             */
            LangugeType getLanguage();
        }
        /**
         * <pre>
         *Команда которая устанавливает языковую схему устр-ва, зависит от локализации программы
         * </pre>
         *
         * Protobuf type {@code setLanguage}
         */
        public static final class setLanguage extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:setLanguage)
                setLanguageOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use setLanguage.newBuilder() to construct.
            private setLanguage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private setLanguage() {
                language_ = 0;
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new setLanguage();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private setLanguage(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            case 8: {
                                int rawValue = input.readEnum();

                                language_ = rawValue;
                                break;
                            }
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_setLanguage_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_setLanguage_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                setLanguage.class, Builder.class);
            }

            public static final int LANGUAGE_FIELD_NUMBER = 1;
            private int language_;
            /**
             * <code>.LangugeType language = 1;</code>
             * @return The enum numeric value on the wire for language.
             */
            @Override public int getLanguageValue() {
                return language_;
            }
            /**
             * <code>.LangugeType language = 1;</code>
             * @return The language.
             */
            @Override public LangugeType getLanguage() {
                @SuppressWarnings("deprecation")
                LangugeType result = LangugeType.valueOf(language_);
                return result == null ? LangugeType.UNRECOGNIZED : result;
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                if (language_ != LangugeType.LANG_UNKNOWN.getNumber()) {
                    output.writeEnum(1, language_);
                }
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                if (language_ != LangugeType.LANG_UNKNOWN.getNumber()) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeEnumSize(1, language_);
                }
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof setLanguage)) {
                    return super.equals(obj);
                }
                setLanguage other = (setLanguage) obj;

                if (language_ != other.language_) return false;
                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                hash = (37 * hash) + LANGUAGE_FIELD_NUMBER;
                hash = (53 * hash) + language_;
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static setLanguage parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static setLanguage parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static setLanguage parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static setLanguage parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static setLanguage parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static setLanguage parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static setLanguage parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static setLanguage parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static setLanguage parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static setLanguage parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static setLanguage parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static setLanguage parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(setLanguage prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * <pre>
             *Команда которая устанавливает языковую схему устр-ва, зависит от локализации программы
             * </pre>
             *
             * Protobuf type {@code setLanguage}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:setLanguage)
                    setLanguageOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_setLanguage_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_setLanguage_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    setLanguage.class, Builder.class);
                }

                // Construct using ForpostServer.setLanguage.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    language_ = 0;

                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_setLanguage_descriptor;
                }

                @Override
                public setLanguage getDefaultInstanceForType() {
                    return setLanguage.getDefaultInstance();
                }

                @Override
                public setLanguage build() {
                    setLanguage result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public setLanguage buildPartial() {
                    setLanguage result = new setLanguage(this);
                    result.language_ = language_;
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof setLanguage) {
                        return mergeFrom((setLanguage)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(setLanguage other) {
                    if (other == setLanguage.getDefaultInstance()) return this;
                    if (other.language_ != 0) {
                        setLanguageValue(other.getLanguageValue());
                    }
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    setLanguage parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (setLanguage) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }

                private int language_ = 0;
                /**
                 * <code>.LangugeType language = 1;</code>
                 * @return The enum numeric value on the wire for language.
                 */
                @Override public int getLanguageValue() {
                    return language_;
                }
                /**
                 * <code>.LangugeType language = 1;</code>
                 * @param value The enum numeric value on the wire for language to set.
                 * @return This builder for chaining.
                 */
                public Builder setLanguageValue(int value) {

                    language_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>.LangugeType language = 1;</code>
                 * @return The language.
                 */
                @Override
                public LangugeType getLanguage() {
                    @SuppressWarnings("deprecation")
                    LangugeType result = LangugeType.valueOf(language_);
                    return result == null ? LangugeType.UNRECOGNIZED : result;
                }
                /**
                 * <code>.LangugeType language = 1;</code>
                 * @param value The language to set.
                 * @return This builder for chaining.
                 */
                public Builder setLanguage(LangugeType value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    language_ = value.getNumber();
                    onChanged();
                    return this;
                }
                /**
                 * <code>.LangugeType language = 1;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearLanguage() {

                    language_ = 0;
                    onChanged();
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:setLanguage)
            }

            // @@protoc_insertion_point(class_scope:setLanguage)
            private static final setLanguage DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new setLanguage();
            }

            public static setLanguage getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<setLanguage>
                    PARSER = new com.google.protobuf.AbstractParser<setLanguage>() {
                @Override
                public setLanguage parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new setLanguage(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<setLanguage> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<setLanguage> getParserForType() {
                return PARSER;
            }

            @Override
            public setLanguage getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface SendDevTypeOrBuilder extends
                // @@protoc_insertion_point(interface_extends:SendDevType)
                com.google.protobuf.MessageOrBuilder {

            /**
             * <code>.DevType devType = 1;</code>
             * @return The enum numeric value on the wire for devType.
             */
            int getDevTypeValue();
            /**
             * <code>.DevType devType = 1;</code>
             * @return The devType.
             */
            DevType getDevType();
        }
        /**
         * <pre>
         *Команда которая устанавливает языковую схему устр-ва, зависит от локализации программы
         * </pre>
         *
         * Protobuf type {@code SendDevType}
         */
        public static final class SendDevType extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:SendDevType)
                SendDevTypeOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use SendDevType.newBuilder() to construct.
            private SendDevType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private SendDevType() {
                devType_ = 0;
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new SendDevType();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private SendDevType(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            case 8: {
                                int rawValue = input.readEnum();

                                devType_ = rawValue;
                                break;
                            }
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_SendDevType_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_SendDevType_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SendDevType.class, Builder.class);
            }

            public static final int DEVTYPE_FIELD_NUMBER = 1;
            private int devType_;
            /**
             * <code>.DevType devType = 1;</code>
             * @return The enum numeric value on the wire for devType.
             */
            @Override public int getDevTypeValue() {
                return devType_;
            }
            /**
             * <code>.DevType devType = 1;</code>
             * @return The devType.
             */
            @Override public DevType getDevType() {
                @SuppressWarnings("deprecation")
                DevType result = DevType.valueOf(devType_);
                return result == null ? DevType.UNRECOGNIZED : result;
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                if (devType_ != DevType.UNKNOWN.getNumber()) {
                    output.writeEnum(1, devType_);
                }
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                if (devType_ != DevType.UNKNOWN.getNumber()) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeEnumSize(1, devType_);
                }
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SendDevType)) {
                    return super.equals(obj);
                }
                SendDevType other = (SendDevType) obj;

                if (devType_ != other.devType_) return false;
                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                hash = (37 * hash) + DEVTYPE_FIELD_NUMBER;
                hash = (53 * hash) + devType_;
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static SendDevType parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SendDevType parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SendDevType parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SendDevType parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SendDevType parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SendDevType parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SendDevType parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static SendDevType parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static SendDevType parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static SendDevType parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static SendDevType parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static SendDevType parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(SendDevType prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * <pre>
             *Команда которая устанавливает языковую схему устр-ва, зависит от локализации программы
             * </pre>
             *
             * Protobuf type {@code SendDevType}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:SendDevType)
                    SendDevTypeOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_SendDevType_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_SendDevType_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    SendDevType.class, Builder.class);
                }

                // Construct using ForpostServer.SendDevType.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    devType_ = 0;

                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_SendDevType_descriptor;
                }

                @Override
                public SendDevType getDefaultInstanceForType() {
                    return SendDevType.getDefaultInstance();
                }

                @Override
                public SendDevType build() {
                    SendDevType result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public SendDevType buildPartial() {
                    SendDevType result = new SendDevType(this);
                    result.devType_ = devType_;
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof SendDevType) {
                        return mergeFrom((SendDevType)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(SendDevType other) {
                    if (other == SendDevType.getDefaultInstance()) return this;
                    if (other.devType_ != 0) {
                        setDevTypeValue(other.getDevTypeValue());
                    }
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    SendDevType parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (SendDevType) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }

                private int devType_ = 0;
                /**
                 * <code>.DevType devType = 1;</code>
                 * @return The enum numeric value on the wire for devType.
                 */
                @Override public int getDevTypeValue() {
                    return devType_;
                }
                /**
                 * <code>.DevType devType = 1;</code>
                 * @param value The enum numeric value on the wire for devType to set.
                 * @return This builder for chaining.
                 */
                public Builder setDevTypeValue(int value) {

                    devType_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>.DevType devType = 1;</code>
                 * @return The devType.
                 */
                @Override
                public DevType getDevType() {
                    @SuppressWarnings("deprecation")
                    DevType result = DevType.valueOf(devType_);
                    return result == null ? DevType.UNRECOGNIZED : result;
                }
                /**
                 * <code>.DevType devType = 1;</code>
                 * @param value The devType to set.
                 * @return This builder for chaining.
                 */
                public Builder setDevType(DevType value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    devType_ = value.getNumber();
                    onChanged();
                    return this;
                }
                /**
                 * <code>.DevType devType = 1;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearDevType() {

                    devType_ = 0;
                    onChanged();
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:SendDevType)
            }

            // @@protoc_insertion_point(class_scope:SendDevType)
            private static final SendDevType DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new SendDevType();
            }

            public static SendDevType getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<SendDevType>
                    PARSER = new com.google.protobuf.AbstractParser<SendDevType>() {
                @Override
                public SendDevType parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new SendDevType(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<SendDevType> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<SendDevType> getParserForType() {
                return PARSER;
            }

            @Override
            public SendDevType getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface TurnOffDeviceOrBuilder extends
                // @@protoc_insertion_point(interface_extends:TurnOffDevice)
                com.google.protobuf.MessageOrBuilder {
        }
        /**
         * <pre>
         *Выключение комплекта
         * </pre>
         *
         * Protobuf type {@code TurnOffDevice}
         */
        public static final class TurnOffDevice extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:TurnOffDevice)
                TurnOffDeviceOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use TurnOffDevice.newBuilder() to construct.
            private TurnOffDevice(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private TurnOffDevice() {
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new TurnOffDevice();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private TurnOffDevice(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_TurnOffDevice_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_TurnOffDevice_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                TurnOffDevice.class, Builder.class);
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof TurnOffDevice)) {
                    return super.equals(obj);
                }
                TurnOffDevice other = (TurnOffDevice) obj;

                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static TurnOffDevice parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static TurnOffDevice parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static TurnOffDevice parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static TurnOffDevice parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static TurnOffDevice parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static TurnOffDevice parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static TurnOffDevice parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static TurnOffDevice parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static TurnOffDevice parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static TurnOffDevice parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static TurnOffDevice parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static TurnOffDevice parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(TurnOffDevice prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * <pre>
             *Выключение комплекта
             * </pre>
             *
             * Protobuf type {@code TurnOffDevice}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:TurnOffDevice)
                    TurnOffDeviceOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_TurnOffDevice_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_TurnOffDevice_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    TurnOffDevice.class, Builder.class);
                }

                // Construct using ForpostServer.TurnOffDevice.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_TurnOffDevice_descriptor;
                }

                @Override
                public TurnOffDevice getDefaultInstanceForType() {
                    return TurnOffDevice.getDefaultInstance();
                }

                @Override
                public TurnOffDevice build() {
                    TurnOffDevice result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public TurnOffDevice buildPartial() {
                    TurnOffDevice result = new TurnOffDevice(this);
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof TurnOffDevice) {
                        return mergeFrom((TurnOffDevice)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(TurnOffDevice other) {
                    if (other == TurnOffDevice.getDefaultInstance()) return this;
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    TurnOffDevice parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (TurnOffDevice) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:TurnOffDevice)
            }

            // @@protoc_insertion_point(class_scope:TurnOffDevice)
            private static final TurnOffDevice DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new TurnOffDevice();
            }

            public static TurnOffDevice getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<TurnOffDevice>
                    PARSER = new com.google.protobuf.AbstractParser<TurnOffDevice>() {
                @Override
                public TurnOffDevice parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new TurnOffDevice(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<TurnOffDevice> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<TurnOffDevice> getParserForType() {
                return PARSER;
            }

            @Override
            public TurnOffDevice getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface GetInfoSlavesOrBuilder extends
                // @@protoc_insertion_point(interface_extends:GetInfoSlaves)
                com.google.protobuf.MessageOrBuilder {
        }
        /**
         * Protobuf type {@code GetInfoSlaves}
         */
        public static final class GetInfoSlaves extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:GetInfoSlaves)
                GetInfoSlavesOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use GetInfoSlaves.newBuilder() to construct.
            private GetInfoSlaves(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private GetInfoSlaves() {
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new GetInfoSlaves();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private GetInfoSlaves(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_GetInfoSlaves_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_GetInfoSlaves_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                GetInfoSlaves.class, Builder.class);
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof GetInfoSlaves)) {
                    return super.equals(obj);
                }
                GetInfoSlaves other = (GetInfoSlaves) obj;

                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static GetInfoSlaves parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static GetInfoSlaves parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static GetInfoSlaves parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static GetInfoSlaves parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static GetInfoSlaves parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static GetInfoSlaves parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static GetInfoSlaves parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static GetInfoSlaves parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static GetInfoSlaves parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static GetInfoSlaves parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static GetInfoSlaves parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static GetInfoSlaves parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(GetInfoSlaves prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * Protobuf type {@code GetInfoSlaves}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:GetInfoSlaves)
                    GetInfoSlavesOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_GetInfoSlaves_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_GetInfoSlaves_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    GetInfoSlaves.class, Builder.class);
                }

                // Construct using ForpostServer.GetInfoSlaves.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_GetInfoSlaves_descriptor;
                }

                @Override
                public GetInfoSlaves getDefaultInstanceForType() {
                    return GetInfoSlaves.getDefaultInstance();
                }

                @Override
                public GetInfoSlaves build() {
                    GetInfoSlaves result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public GetInfoSlaves buildPartial() {
                    GetInfoSlaves result = new GetInfoSlaves(this);
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof GetInfoSlaves) {
                        return mergeFrom((GetInfoSlaves)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(GetInfoSlaves other) {
                    if (other == GetInfoSlaves.getDefaultInstance()) return this;
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    GetInfoSlaves parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (GetInfoSlaves) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:GetInfoSlaves)
            }

            // @@protoc_insertion_point(class_scope:GetInfoSlaves)
            private static final GetInfoSlaves DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new GetInfoSlaves();
            }

            public static GetInfoSlaves getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<GetInfoSlaves>
                    PARSER = new com.google.protobuf.AbstractParser<GetInfoSlaves>() {
                @Override
                public GetInfoSlaves parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new GetInfoSlaves(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<GetInfoSlaves> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<GetInfoSlaves> getParserForType() {
                return PARSER;
            }

            @Override
            public GetInfoSlaves getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface SetGameIdOrBuilder extends
                // @@protoc_insertion_point(interface_extends:SetGameId)
                com.google.protobuf.MessageOrBuilder {

            /**
             * <pre>
             * id current game
             * </pre>
             *
             * <code>uint32 game_id = 1;</code>
             * @return The gameId.
             */
            int getGameId();
        }
        /**
         * <pre>
         * Установка ид игры
         * </pre>
         *
         * Protobuf type {@code SetGameId}
         */
        public static final class SetGameId extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:SetGameId)
                SetGameIdOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use SetGameId.newBuilder() to construct.
            private SetGameId(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private SetGameId() {
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new SetGameId();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private SetGameId(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            case 8: {

                                gameId_ = input.readUInt32();
                                break;
                            }
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_SetGameId_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_SetGameId_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SetGameId.class, Builder.class);
            }

            public static final int GAME_ID_FIELD_NUMBER = 1;
            private int gameId_;
            /**
             * <pre>
             * id current game
             * </pre>
             *
             * <code>uint32 game_id = 1;</code>
             * @return The gameId.
             */
            @Override
            public int getGameId() {
                return gameId_;
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                if (gameId_ != 0) {
                    output.writeUInt32(1, gameId_);
                }
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                if (gameId_ != 0) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeUInt32Size(1, gameId_);
                }
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SetGameId)) {
                    return super.equals(obj);
                }
                SetGameId other = (SetGameId) obj;

                if (getGameId()
                        != other.getGameId()) return false;
                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                hash = (37 * hash) + GAME_ID_FIELD_NUMBER;
                hash = (53 * hash) + getGameId();
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static SetGameId parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SetGameId parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SetGameId parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SetGameId parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SetGameId parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SetGameId parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SetGameId parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static SetGameId parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static SetGameId parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static SetGameId parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static SetGameId parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static SetGameId parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(SetGameId prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * <pre>
             * Установка ид игры
             * </pre>
             *
             * Protobuf type {@code SetGameId}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:SetGameId)
                    SetGameIdOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_SetGameId_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_SetGameId_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    SetGameId.class, Builder.class);
                }

                // Construct using ForpostServer.SetGameId.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    gameId_ = 0;

                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_SetGameId_descriptor;
                }

                @Override
                public SetGameId getDefaultInstanceForType() {
                    return SetGameId.getDefaultInstance();
                }

                @Override
                public SetGameId build() {
                    SetGameId result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public SetGameId buildPartial() {
                    SetGameId result = new SetGameId(this);
                    result.gameId_ = gameId_;
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof SetGameId) {
                        return mergeFrom((SetGameId)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(SetGameId other) {
                    if (other == SetGameId.getDefaultInstance()) return this;
                    if (other.getGameId() != 0) {
                        setGameId(other.getGameId());
                    }
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    SetGameId parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (SetGameId) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }

                private int gameId_ ;
                /**
                 * <pre>
                 * id current game
                 * </pre>
                 *
                 * <code>uint32 game_id = 1;</code>
                 * @return The gameId.
                 */
                @Override
                public int getGameId() {
                    return gameId_;
                }
                /**
                 * <pre>
                 * id current game
                 * </pre>
                 *
                 * <code>uint32 game_id = 1;</code>
                 * @param value The gameId to set.
                 * @return This builder for chaining.
                 */
                public Builder setGameId(int value) {

                    gameId_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * id current game
                 * </pre>
                 *
                 * <code>uint32 game_id = 1;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearGameId() {

                    gameId_ = 0;
                    onChanged();
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:SetGameId)
            }

            // @@protoc_insertion_point(class_scope:SetGameId)
            private static final SetGameId DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new SetGameId();
            }

            public static SetGameId getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<SetGameId>
                    PARSER = new com.google.protobuf.AbstractParser<SetGameId>() {
                @Override
                public SetGameId parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new SetGameId(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<SetGameId> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<SetGameId> getParserForType() {
                return PARSER;
            }

            @Override
            public SetGameId getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public interface LowLevelDeviceConfigOrBuilder extends
                // @@protoc_insertion_point(interface_extends:LowLevelDeviceConfig)
                com.google.protobuf.MessageOrBuilder {

            /**
             * <code>.HandSensorType handSensType = 1;</code>
             * @return The enum numeric value on the wire for handSensType.
             */
            int getHandSensTypeValue();
            /**
             * <code>.HandSensorType handSensType = 1;</code>
             * @return The handSensType.
             */
            HandSensorType getHandSensType();

            /**
             * <code>.DisplayType displayType = 2;</code>
             * @return The enum numeric value on the wire for displayType.
             */
            int getDisplayTypeValue();
            /**
             * <code>.DisplayType displayType = 2;</code>
             * @return The displayType.
             */
            DisplayType getDisplayType();
        }
        /**
         * Protobuf type {@code LowLevelDeviceConfig}
         */
        public static final class LowLevelDeviceConfig extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:LowLevelDeviceConfig)
                LowLevelDeviceConfigOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use LowLevelDeviceConfig.newBuilder() to construct.
            private LowLevelDeviceConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private LowLevelDeviceConfig() {
                handSensType_ = 0;
                displayType_ = 0;
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new LowLevelDeviceConfig();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private LowLevelDeviceConfig(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            case 8: {
                                int rawValue = input.readEnum();

                                handSensType_ = rawValue;
                                break;
                            }
                            case 16: {
                                int rawValue = input.readEnum();

                                displayType_ = rawValue;
                                break;
                            }
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ForpostServer.internal_static_LowLevelDeviceConfig_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ForpostServer.internal_static_LowLevelDeviceConfig_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                LowLevelDeviceConfig.class, Builder.class);
            }

            public static final int HANDSENSTYPE_FIELD_NUMBER = 1;
            private int handSensType_;
            /**
             * <code>.HandSensorType handSensType = 1;</code>
             * @return The enum numeric value on the wire for handSensType.
             */
            @Override public int getHandSensTypeValue() {
                return handSensType_;
            }
            /**
             * <code>.HandSensorType handSensType = 1;</code>
             * @return The handSensType.
             */
            @Override public HandSensorType getHandSensType() {
                @SuppressWarnings("deprecation")
                HandSensorType result = HandSensorType.valueOf(handSensType_);
                return result == null ? HandSensorType.UNRECOGNIZED : result;
            }

            public static final int DISPLAYTYPE_FIELD_NUMBER = 2;
            private int displayType_;
            /**
             * <code>.DisplayType displayType = 2;</code>
             * @return The enum numeric value on the wire for displayType.
             */
            @Override public int getDisplayTypeValue() {
                return displayType_;
            }
            /**
             * <code>.DisplayType displayType = 2;</code>
             * @return The displayType.
             */
            @Override public DisplayType getDisplayType() {
                @SuppressWarnings("deprecation")
                DisplayType result = DisplayType.valueOf(displayType_);
                return result == null ? DisplayType.UNRECOGNIZED : result;
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                if (handSensType_ != HandSensorType.NON_HAND_SENS.getNumber()) {
                    output.writeEnum(1, handSensType_);
                }
                if (displayType_ != DisplayType.UNDEFINE.getNumber()) {
                    output.writeEnum(2, displayType_);
                }
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                if (handSensType_ != HandSensorType.NON_HAND_SENS.getNumber()) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeEnumSize(1, handSensType_);
                }
                if (displayType_ != DisplayType.UNDEFINE.getNumber()) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeEnumSize(2, displayType_);
                }
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof LowLevelDeviceConfig)) {
                    return super.equals(obj);
                }
                LowLevelDeviceConfig other = (LowLevelDeviceConfig) obj;

                if (handSensType_ != other.handSensType_) return false;
                if (displayType_ != other.displayType_) return false;
                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                hash = (37 * hash) + HANDSENSTYPE_FIELD_NUMBER;
                hash = (53 * hash) + handSensType_;
                hash = (37 * hash) + DISPLAYTYPE_FIELD_NUMBER;
                hash = (53 * hash) + displayType_;
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static LowLevelDeviceConfig parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static LowLevelDeviceConfig parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static LowLevelDeviceConfig parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static LowLevelDeviceConfig parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static LowLevelDeviceConfig parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static LowLevelDeviceConfig parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static LowLevelDeviceConfig parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static LowLevelDeviceConfig parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static LowLevelDeviceConfig parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static LowLevelDeviceConfig parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static LowLevelDeviceConfig parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static LowLevelDeviceConfig parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(LowLevelDeviceConfig prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * Protobuf type {@code LowLevelDeviceConfig}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:LowLevelDeviceConfig)
                    LowLevelDeviceConfigOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return ForpostServer.internal_static_LowLevelDeviceConfig_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return ForpostServer.internal_static_LowLevelDeviceConfig_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    LowLevelDeviceConfig.class, Builder.class);
                }

                // Construct using ForpostServer.LowLevelDeviceConfig.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                    }
                }
                @Override
                public Builder clear() {
                    super.clear();
                    handSensType_ = 0;

                    displayType_ = 0;

                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return ForpostServer.internal_static_LowLevelDeviceConfig_descriptor;
                }

                @Override
                public LowLevelDeviceConfig getDefaultInstanceForType() {
                    return LowLevelDeviceConfig.getDefaultInstance();
                }

                @Override
                public LowLevelDeviceConfig build() {
                    LowLevelDeviceConfig result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public LowLevelDeviceConfig buildPartial() {
                    LowLevelDeviceConfig result = new LowLevelDeviceConfig(this);
                    result.handSensType_ = handSensType_;
                    result.displayType_ = displayType_;
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof LowLevelDeviceConfig) {
                        return mergeFrom((LowLevelDeviceConfig)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(LowLevelDeviceConfig other) {
                    if (other == LowLevelDeviceConfig.getDefaultInstance()) return this;
                    if (other.handSensType_ != 0) {
                        setHandSensTypeValue(other.getHandSensTypeValue());
                    }
                    if (other.displayType_ != 0) {
                        setDisplayTypeValue(other.getDisplayTypeValue());
                    }
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    LowLevelDeviceConfig parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (LowLevelDeviceConfig) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }

                private int handSensType_ = 0;
                /**
                 * <code>.HandSensorType handSensType = 1;</code>
                 * @return The enum numeric value on the wire for handSensType.
                 */
                @Override public int getHandSensTypeValue() {
                    return handSensType_;
                }
                /**
                 * <code>.HandSensorType handSensType = 1;</code>
                 * @param value The enum numeric value on the wire for handSensType to set.
                 * @return This builder for chaining.
                 */
                public Builder setHandSensTypeValue(int value) {

                    handSensType_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>.HandSensorType handSensType = 1;</code>
                 * @return The handSensType.
                 */
                @Override
                public HandSensorType getHandSensType() {
                    @SuppressWarnings("deprecation")
                    HandSensorType result = HandSensorType.valueOf(handSensType_);
                    return result == null ? HandSensorType.UNRECOGNIZED : result;
                }
                /**
                 * <code>.HandSensorType handSensType = 1;</code>
                 * @param value The handSensType to set.
                 * @return This builder for chaining.
                 */
                public Builder setHandSensType(HandSensorType value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    handSensType_ = value.getNumber();
                    onChanged();
                    return this;
                }
                /**
                 * <code>.HandSensorType handSensType = 1;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearHandSensType() {

                    handSensType_ = 0;
                    onChanged();
                    return this;
                }

                private int displayType_ = 0;
                /**
                 * <code>.DisplayType displayType = 2;</code>
                 * @return The enum numeric value on the wire for displayType.
                 */
                @Override public int getDisplayTypeValue() {
                    return displayType_;
                }
                /**
                 * <code>.DisplayType displayType = 2;</code>
                 * @param value The enum numeric value on the wire for displayType to set.
                 * @return This builder for chaining.
                 */
                public Builder setDisplayTypeValue(int value) {

                    displayType_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>.DisplayType displayType = 2;</code>
                 * @return The displayType.
                 */
                @Override
                public DisplayType getDisplayType() {
                    @SuppressWarnings("deprecation")
                    DisplayType result = DisplayType.valueOf(displayType_);
                    return result == null ? DisplayType.UNRECOGNIZED : result;
                }
                /**
                 * <code>.DisplayType displayType = 2;</code>
                 * @param value The displayType to set.
                 * @return This builder for chaining.
                 */
                public Builder setDisplayType(DisplayType value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    displayType_ = value.getNumber();
                    onChanged();
                    return this;
                }
                /**
                 * <code>.DisplayType displayType = 2;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearDisplayType() {

                    displayType_ = 0;
                    onChanged();
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:LowLevelDeviceConfig)
            }

            // @@protoc_insertion_point(class_scope:LowLevelDeviceConfig)
            private static final LowLevelDeviceConfig DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new LowLevelDeviceConfig();
            }

            public static LowLevelDeviceConfig getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private static final com.google.protobuf.Parser<LowLevelDeviceConfig>
                    PARSER = new com.google.protobuf.AbstractParser<LowLevelDeviceConfig>() {
                @Override
                public LowLevelDeviceConfig parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new LowLevelDeviceConfig(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<LowLevelDeviceConfig> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<LowLevelDeviceConfig> getParserForType() {
                return PARSER;
            }

            @Override
            public LowLevelDeviceConfig getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_HelloFromDev_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_HelloFromDev_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_StatById_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_StatById_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_StartGame_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_StartGame_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_StopGame_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_StopGame_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_PauseGame_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_PauseGame_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_SetIRstrength_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_SetIRstrength_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_DeviceVolumeLevel_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_DeviceVolumeLevel_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_SetVolume_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_SetVolume_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_PlaySound_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_PlaySound_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_StopSound_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_StopSound_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_GetSoundsInfo_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_GetSoundsInfo_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_SoundInfo_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_SoundInfo_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_SoundsInfoResponce_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_SoundsInfoResponce_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_SlaveInfo_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_SlaveInfo_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_SlavesInfoResponce_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_SlavesInfoResponce_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_SlaveDisconnected_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_SlaveDisconnected_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_KitBatteryLevel_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_KitBatteryLevel_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_ChangeId_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_ChangeId_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_Ping_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_Ping_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_ResetStat_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_ResetStat_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_MilesCommand_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_MilesCommand_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_ReturnToDefSettings_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_ReturnToDefSettings_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_GetBatteryLevel_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_GetBatteryLevel_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_ResponseBatteryLevel_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_ResponseBatteryLevel_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_SetBrightnes_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_SetBrightnes_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_Error_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_Error_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_UpdateDev_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_UpdateDev_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_setLanguage_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_setLanguage_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_SendDevType_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_SendDevType_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_TurnOffDevice_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_TurnOffDevice_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_GetInfoSlaves_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_GetInfoSlaves_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_SetGameId_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_SetGameId_fieldAccessorTable;
        private static final com.google.protobuf.Descriptors.Descriptor
                internal_static_LowLevelDeviceConfig_descriptor;
        private static final
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internal_static_LowLevelDeviceConfig_fieldAccessorTable;

        public static com.google.protobuf.Descriptors.FileDescriptor
        getDescriptor() {
            return descriptor;
        }
        private static  com.google.protobuf.Descriptors.FileDescriptor
                descriptor;
        static {
            String[] descriptorData = {
                    "\n\024forpost_server.proto\032\rforpost.proto\"\247\003" +
                            "\n\014HelloFromDev\022\021\n\tdevice_id\030\001 \001(\005\022\020\n\010kit" +
                            "_tick\030\002 \001(\005\022\033\n\023was_early_connected\030\003 \001(\010" +
                            "\022\034\n\020firmware_version\030\004 \001(\005B\002\030\001\022\032\n\016global" +
                            "_changes\030\005 \001(\005B\002\030\001\022\031\n\rminor_changes\030\006 \001(" +
                            "\005B\002\030\001\022\031\n\007devtype\030\007 \001(\0162\010.DevType\022\024\n\014Seri" +
                            "alNumber\030\010 \001(\005\022\031\n\021diodes_brightness\030\t \001(" +
                            "\r\022\032\n\022display_brightness\030\n \001(\r\022\024\n\014sound_v" +
                            "olume\030\013 \001(\r\022\032\n\004lang\030\014 \001(\0162\014.LangugeType\022" +
                            "\024\n\014firmware_ver\030\r \001(\014\022&\n\014type_display\030\016 " +
                            "\001(\0162\014.DisplayTypeB\002\030\001\022\020\n\010bios_ver\030\017 \001(\014\022" +
                            "\020\n\010boot_ver\030\020 \001(\014:\004\210\265\030\001\"\267\004\n\010StatById\022\n\n\002" +
                            "id\030\001 \001(\005\022\016\n\006damage\030\002 \001(\005\022\024\n\014shots_number" +
                            "\030\003 \001(\005\022\r\n\005kills\030\004 \001(\005\022\020\n\010kit_tick\030\005 \001(\005\022" +
                            "\023\n\013damage_zone\030\006 \001(\005\022\033\n\023shots_not_specif" +
                            "ied\030\007 \001(\r\022 \n\030shots_by_body_front_zone\030\010 " +
                            "\001(\r\022\037\n\027shots_by_body_back_zone\030\t \001(\r\022\036\n\026" +
                            "shots_by_left_arm_zone\030\n \001(\r\022\037\n\027shots_by" +
                            "_right_arm_zone\030\013 \001(\r\022\032\n\022shots_by_head_z" +
                            "one\030\014 \001(\r\022\034\n\024damage_not_specified\030\r \001(\r\022" +
                            "!\n\031damage_by_body_front_zone\030\016 \001(\r\022 \n\030da" +
                            "mage_by_body_back_zone\030\017 \001(\r\022\037\n\027damage_b" +
                            "y_left_arm_zone\030\020 \001(\r\022 \n\030damage_by_right" +
                            "_arm_zone\030\021 \001(\r\022\033\n\023damage_by_head_zone\030\022" +
                            " \001(\r\022\034\n\024damage_by_tager_zone\030\023 \001(\r\022\033\n\023sh" +
                            "ots_by_tager_zone\030\024 \001(\r:\010\210\265\030\006\220\265\030\023\"2\n\tSta" +
                            "rtGame\022\016\n\006silent\030\001 \001(\010\022\017\n\007game_id\030\002 \001(\r:" +
                            "\004\220\265\030\003\"\020\n\010StopGame:\004\220\265\030\004\"\021\n\tPauseGame:\004\220\265" +
                            "\030\n\"*\n\rSetIRstrength\022\023\n\013IR_strength\030\001 \001(\005" +
                            ":\004\220\265\030\026\"6\n\021DeviceVolumeLevel\022\024\n\014volume_le" +
                            "vel\030\001 \001(\005\022\013\n\003uid\030\002 \001(\r\"]\n\tSetVolume\022\030\n\014v" +
                            "olume_level\030\001 \001(\005B\002\030\001\0220\n\024devices_volume_" +
                            "level\030\002 \003(\0132\022.DeviceVolumeLevel:\004\220\265\030\016\"T\n" +
                            "\tPlaySound\022\n\n\002id\030\001 \001(\r\022\020\n\010priority\030\002 \001(\r" +
                            "\022\021\n\tis_looped\030\003 \001(\010\022\020\n\010filename\030\004 \001(\t:\004\220" +
                            "\265\030\036\"\035\n\tStopSound\022\n\n\002id\030\001 \001(\r:\004\220\265\030\037\"\025\n\rGe" +
                            "tSoundsInfo:\004\220\265\030 \"+\n\tSoundInfo\022\014\n\004name\030\001" +
                            " \001(\t\022\020\n\010filename\030\003 \001(\t\"D\n\022SoundsInfoResp" +
                            "once\022\030\n\004info\030\001 \003(\0132\n.SoundInfo\022\016\n\006status" +
                            "\030\002 \001(\005:\004\210\265\030\010\"u\n\tSlaveInfo\022\030\n\004type\030\001 \001(\0162" +
                            "\n.SlaveType\022\016\n\006dev_id\030\002 \001(\005\022\024\n\014firmware_" +
                            "ver\030\003 \001(\014\022\020\n\010bios_ver\030\004 \001(\014\022\020\n\010boot_ver\030" +
                            "\005 \001(\014:\004\210\265\030#\"D\n\022SlavesInfoResponce\022\030\n\004inf" +
                            "o\030\001 \003(\0132\n.SlaveInfo\022\016\n\006status\030\002 \001(\005:\004\210\265\030" +
                            "!\")\n\021SlaveDisconnected\022\016\n\006dev_id\030\001 \001(\005:\004" +
                            "\210\265\030\"\"4\n\017KitBatteryLevel\022\025\n\rbattery_level" +
                            "\030\001 \001(\005\022\n\n\002id\030\002 \001(\r\"%\n\010ChangeId\022\017\n\007next_i" +
                            "d\030\001 \001(\005:\010\220\265\030\014\210\265\030\005\"\020\n\004Ping:\010\220\265\030\021\210\265\030\007\"\021\n\tR" +
                            "esetStat:\004\220\265\030\017\"%\n\014MilesCommand\022\017\n\007comman" +
                            "d\030\001 \001(\005:\004\220\265\030\020\"\033\n\023ReturnToDefSettings:\004\220\265" +
                            "\030\006\"\027\n\017GetBatteryLevel:\004\220\265\030\027\"\201\001\n\024Response" +
                            "BatteryLevel\022\031\n\rbattery_level\030\001 \001(\005B\002\030\001\022" +
                            "!\n\025battery_level_bandage\030\002 \001(\005B\002\030\001\022%\n\013ma" +
                            "ssBatLevl\030\003 \003(\0132\020.KitBatteryLevel:\004\210\265\030\026\"" +
                            "b\n\014SetBrightnes\022\034\n\024set_diodes_brightnes\030" +
                            "\001 \001(\005\022\036\n\026set_display_brightness\030\002 \001(\005\022\016\n" +
                            "\006dev_id\030\003 \001(\005:\004\220\265\030\030\"-\n\005Error\022\036\n\nerrMessa" +
                            "ge\030\001 \001(\0162\n.ErrorType:\004\210\265\030\027\"\021\n\tUpdateDev:" +
                            "\004\220\265\030\031\"7\n\013setLanguage\022\036\n\010language\030\001 \001(\0162\014" +
                            ".LangugeType:\010\220\265\030\032\210\265\030\030\"2\n\013SendDevType\022\031\n" +
                            "\007devType\030\001 \001(\0162\010.DevType:\010\220\265\030\"\210\265\030\031\"\025\n\rTu" +
                            "rnOffDevice:\004\220\265\030$\"\025\n\rGetInfoSlaves:\004\220\265\030%" +
                            "\"\"\n\tSetGameId\022\017\n\007game_id\030\001 \001(\r:\004\220\265\030&\"j\n\024" +
                            "LowLevelDeviceConfig\022%\n\014handSensType\030\001 \001" +
                            "(\0162\017.HandSensorType\022!\n\013displayType\030\002 \001(\016" +
                            "2\014.DisplayType:\010\220\265\030H\210\265\030\032*\350\001\n\tErrorType\022\r" +
                            "\n\te_UNKNOWN\020\000\022\021\n\re_IR_strength\020\001\022\022\n\016e_vo" +
                            "lume_level\020\002\022\r\n\te_next_id\020\003\022\r\n\te_command" +
                            "\020\004\022\025\n\021e_activation_time\020\005\022\025\n\021e_inactivit" +
                            "y_time\020\006\022\025\n\021e_rad_health_take\020\007\022\024\n\020e_med" +
                            "_health_add\020\010\022\017\n\013e_cp_health\020\t\022\017\n\013e_brig" +
                            "htnes\020\n\022\n\n\006e_mode\020\013*\331\001\n\007DevType\022\013\n\007UNKNO" +
                            "WN\020\000\022\022\n\016TAGER_NETRONIC\020\001\022\007\n\003KTS\020\002\022\006\n\002MS\020" +
                            "\003\022\n\n\006miniMS\020\004\022\020\n\014MillitaryKit\020\005\022\021\n\rMilli" +
                            "taryDome\020\006\022\010\n\004MP_4\020\007\022\t\n\005GLOCK\020\010\022\007\n\003PKM\020\t" +
                            "\022\021\n\rTAGER_ECLIPSE\020\n\022\017\n\013TAGER_PULSE\020\013\022\014\n\010" +
                            "TAGER_VR\020\014\022\014\n\010BOMB_PRO\020\r\022\r\n\tTAGER_F05\020\016*" +
                            "\212\001\n\013LangugeType\022\020\n\014LANG_UNKNOWN\020\000\022\013\n\007RUS" +
                            "SIAN\020\001\022\013\n\007ENGLISH\020\002\022\013\n\007SPANISH\020\003\022\n\n\006FREN" +
                            "CH\020\004\022\n\n\006GERMAN\020\005\022\013\n\007ITALIAN\020\006\022\r\n\tUKRAINI" +
                            "AN\020\007\022\016\n\nmaxLangNum\020\010*$\n\nSlaveState\022\013\n\007DE" +
                            "LETED\020\000\022\t\n\005ADDED\020\001*c\n\013DisplayType\022\014\n\010UND" +
                            "EFINE\020\000\022\010\n\004OLED\020\001\022\007\n\003LCD\020\002\022\007\n\003TFT\020\003\022\007\n\003I" +
                            "PS\020\004\022\016\n\nNO_DISPLAY\020\005\022\021\n\rAUTODETECTION\020\006*" +
                            "Y\n\016HandSensorType\022\021\n\rNON_HAND_SENS\020\000\022\023\n\017" +
                            "TTP223_ORIGINAL\020\001\022\017\n\013TTP223_COPY\020\002\022\016\n\nAT" +
                            "42QT1011\020\003*\255\001\n\tSlaveType\022\024\n\020SlaveType_Un" +
                            "know\020\000\022\024\n\020SlaveType_Hb_5_0\020\001\022\024\n\020SlaveTyp" +
                            "e_Hb_4_4\020\002\022\025\n\021SlaveType_Vest_12\020\003\022\025\n\021Sla" +
                            "veType_Vest_10\020\004\022\030\n\024SlaveType_StressBelt" +
                            "\020\005\022\026\n\022SlaveType_Vest_3_0\020\006B\034H\003Z\016forpost_" +
                            "server\212\265\030\006commonX\000b\006proto3"
            };
            descriptor = com.google.protobuf.Descriptors.FileDescriptor
                    .internalBuildGeneratedFileFrom(descriptorData,
                            new com.google.protobuf.Descriptors.FileDescriptor[] {
                                    Forpost.getDescriptor(),
                            });
            internal_static_HelloFromDev_descriptor =
                    getDescriptor().getMessageTypes().get(0);
            internal_static_HelloFromDev_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_HelloFromDev_descriptor,
                    new String[] { "DeviceId", "KitTick", "WasEarlyConnected", "FirmwareVersion", "GlobalChanges", "MinorChanges", "Devtype", "SerialNumber", "DiodesBrightness", "DisplayBrightness", "SoundVolume", "Lang", "FirmwareVer", "TypeDisplay", "BiosVer", "BootVer", });
            internal_static_StatById_descriptor =
                    getDescriptor().getMessageTypes().get(1);
            internal_static_StatById_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_StatById_descriptor,
                    new String[] { "Id", "Damage", "ShotsNumber", "Kills", "KitTick", "DamageZone", "ShotsNotSpecified", "ShotsByBodyFrontZone", "ShotsByBodyBackZone", "ShotsByLeftArmZone", "ShotsByRightArmZone", "ShotsByHeadZone", "DamageNotSpecified", "DamageByBodyFrontZone", "DamageByBodyBackZone", "DamageByLeftArmZone", "DamageByRightArmZone", "DamageByHeadZone", "DamageByTagerZone", "ShotsByTagerZone", });
            internal_static_StartGame_descriptor =
                    getDescriptor().getMessageTypes().get(2);
            internal_static_StartGame_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_StartGame_descriptor,
                    new String[] { "Silent", "GameId", });
            internal_static_StopGame_descriptor =
                    getDescriptor().getMessageTypes().get(3);
            internal_static_StopGame_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_StopGame_descriptor,
                    new String[] { });
            internal_static_PauseGame_descriptor =
                    getDescriptor().getMessageTypes().get(4);
            internal_static_PauseGame_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_PauseGame_descriptor,
                    new String[] { });
            internal_static_SetIRstrength_descriptor =
                    getDescriptor().getMessageTypes().get(5);
            internal_static_SetIRstrength_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_SetIRstrength_descriptor,
                    new String[] { "IRStrength", });
            internal_static_DeviceVolumeLevel_descriptor =
                    getDescriptor().getMessageTypes().get(6);
            internal_static_DeviceVolumeLevel_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_DeviceVolumeLevel_descriptor,
                    new String[] { "VolumeLevel", "Uid", });
            internal_static_SetVolume_descriptor =
                    getDescriptor().getMessageTypes().get(7);
            internal_static_SetVolume_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_SetVolume_descriptor,
                    new String[] { "VolumeLevel", "DevicesVolumeLevel", });
            internal_static_PlaySound_descriptor =
                    getDescriptor().getMessageTypes().get(8);
            internal_static_PlaySound_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_PlaySound_descriptor,
                    new String[] { "Id", "Priority", "IsLooped", "Filename", });
            internal_static_StopSound_descriptor =
                    getDescriptor().getMessageTypes().get(9);
            internal_static_StopSound_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_StopSound_descriptor,
                    new String[] { "Id", });
            internal_static_GetSoundsInfo_descriptor =
                    getDescriptor().getMessageTypes().get(10);
            internal_static_GetSoundsInfo_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_GetSoundsInfo_descriptor,
                    new String[] { });
            internal_static_SoundInfo_descriptor =
                    getDescriptor().getMessageTypes().get(11);
            internal_static_SoundInfo_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_SoundInfo_descriptor,
                    new String[] { "Name", "Filename", });
            internal_static_SoundsInfoResponce_descriptor =
                    getDescriptor().getMessageTypes().get(12);
            internal_static_SoundsInfoResponce_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_SoundsInfoResponce_descriptor,
                    new String[] { "Info", "Status", });
            internal_static_SlaveInfo_descriptor =
                    getDescriptor().getMessageTypes().get(13);
            internal_static_SlaveInfo_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_SlaveInfo_descriptor,
                    new String[] { "Type", "DevId", "FirmwareVer", "BiosVer", "BootVer", });
            internal_static_SlavesInfoResponce_descriptor =
                    getDescriptor().getMessageTypes().get(14);
            internal_static_SlavesInfoResponce_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_SlavesInfoResponce_descriptor,
                    new String[] { "Info", "Status", });
            internal_static_SlaveDisconnected_descriptor =
                    getDescriptor().getMessageTypes().get(15);
            internal_static_SlaveDisconnected_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_SlaveDisconnected_descriptor,
                    new String[] { "DevId", });
            internal_static_KitBatteryLevel_descriptor =
                    getDescriptor().getMessageTypes().get(16);
            internal_static_KitBatteryLevel_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_KitBatteryLevel_descriptor,
                    new String[] { "BatteryLevel", "Id", });
            internal_static_ChangeId_descriptor =
                    getDescriptor().getMessageTypes().get(17);
            internal_static_ChangeId_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_ChangeId_descriptor,
                    new String[] { "NextId", });
            internal_static_Ping_descriptor =
                    getDescriptor().getMessageTypes().get(18);
            internal_static_Ping_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_Ping_descriptor,
                    new String[] { });
            internal_static_ResetStat_descriptor =
                    getDescriptor().getMessageTypes().get(19);
            internal_static_ResetStat_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_ResetStat_descriptor,
                    new String[] { });
            internal_static_MilesCommand_descriptor =
                    getDescriptor().getMessageTypes().get(20);
            internal_static_MilesCommand_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_MilesCommand_descriptor,
                    new String[] { "Command", });
            internal_static_ReturnToDefSettings_descriptor =
                    getDescriptor().getMessageTypes().get(21);
            internal_static_ReturnToDefSettings_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_ReturnToDefSettings_descriptor,
                    new String[] { });
            internal_static_GetBatteryLevel_descriptor =
                    getDescriptor().getMessageTypes().get(22);
            internal_static_GetBatteryLevel_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_GetBatteryLevel_descriptor,
                    new String[] { });
            internal_static_ResponseBatteryLevel_descriptor =
                    getDescriptor().getMessageTypes().get(23);
            internal_static_ResponseBatteryLevel_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_ResponseBatteryLevel_descriptor,
                    new String[] { "BatteryLevel", "BatteryLevelBandage", "MassBatLevl", });
            internal_static_SetBrightnes_descriptor =
                    getDescriptor().getMessageTypes().get(24);
            internal_static_SetBrightnes_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_SetBrightnes_descriptor,
                    new String[] { "SetDiodesBrightnes", "SetDisplayBrightness", "DevId", });
            internal_static_Error_descriptor =
                    getDescriptor().getMessageTypes().get(25);
            internal_static_Error_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_Error_descriptor,
                    new String[] { "ErrMessage", });
            internal_static_UpdateDev_descriptor =
                    getDescriptor().getMessageTypes().get(26);
            internal_static_UpdateDev_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_UpdateDev_descriptor,
                    new String[] { });
            internal_static_setLanguage_descriptor =
                    getDescriptor().getMessageTypes().get(27);
            internal_static_setLanguage_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_setLanguage_descriptor,
                    new String[] { "Language", });
            internal_static_SendDevType_descriptor =
                    getDescriptor().getMessageTypes().get(28);
            internal_static_SendDevType_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_SendDevType_descriptor,
                    new String[] { "DevType", });
            internal_static_TurnOffDevice_descriptor =
                    getDescriptor().getMessageTypes().get(29);
            internal_static_TurnOffDevice_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_TurnOffDevice_descriptor,
                    new String[] { });
            internal_static_GetInfoSlaves_descriptor =
                    getDescriptor().getMessageTypes().get(30);
            internal_static_GetInfoSlaves_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_GetInfoSlaves_descriptor,
                    new String[] { });
            internal_static_SetGameId_descriptor =
                    getDescriptor().getMessageTypes().get(31);
            internal_static_SetGameId_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_SetGameId_descriptor,
                    new String[] { "GameId", });
            internal_static_LowLevelDeviceConfig_descriptor =
                    getDescriptor().getMessageTypes().get(32);
            internal_static_LowLevelDeviceConfig_fieldAccessorTable = new
                    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                    internal_static_LowLevelDeviceConfig_descriptor,
                    new String[] { "HandSensType", "DisplayType", });
            com.google.protobuf.ExtensionRegistry registry =
                    com.google.protobuf.ExtensionRegistry.newInstance();
            registry.add(Forpost.c2SId);
            registry.add(Forpost.s2CId);
            registry.add(Forpost.stmFilename);
            com.google.protobuf.Descriptors.FileDescriptor
                    .internalUpdateFileDescriptor(descriptor, registry);
            Forpost.getDescriptor();
        }

        // @@protoc_insertion_point(outer_class_scope)
    }
