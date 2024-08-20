package net.luckshark.tool;

import net.luckshark.sound.ModJukeboxSongs;
import net.minecraft.registry.RegistryKey;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class SongsCount {
    public static int songsCount() {

        // 获取接口 ModJukeboxSongs 的 Class 对象
        Class<?> clazz = ModJukeboxSongs.class;

        // 获取所有声明的字段
        Field[] fields = clazz.getDeclaredFields();

        int count = 0;

        for (Field field : fields) {
            // 获取字段的泛型类型
            Type genericType = field.getGenericType();

            // 检查字段是否是 RegistryKey 类型的泛型
            if (genericType instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) genericType;

                // 获取泛型的原始类型是否为 RegistryKey
                if (parameterizedType.getRawType() == RegistryKey.class) {
                    // 获取泛型的实际类型参数
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();

                    // 仅检查第一个参数，如果它是JukeboxSong
                    if (actualTypeArguments.length > 0) {
                        Class<?> argumentClass = (Class<?>) actualTypeArguments[0];

                        // 使用类名匹配来确定它是否是JukeboxSong类型
                        if (argumentClass.getSimpleName().equals("JukeboxSong")) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
