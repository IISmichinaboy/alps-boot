package com.xmi.alps.commons.collect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * Collections
 *
 * @author miwanqiang
 * @date 2022/1/7
 */
public class Collections {

    /**
     * 判断集合是空
     * @param collection
     * @return
     */
    public static <T> boolean isEmpty(Collection<T> collection) {
        return collection == null || collection.isEmpty();
    }

    /**
     * 判断集合非空
     * @param collection
     * @return
     */
    public static <T> boolean isNotEmpty(Collection<T> collection) {
        return collection == null || collection.isEmpty();
    }

    /**
     * 遍历处理集合
     * @param collection
     * @param consumer
     * @param <T>
     */
    public static <T> void foreach(Collection<T> collection, Consumer<? super T> consumer) {
        if (isNotEmpty(collection)) {
            collection.stream().forEach(consumer);
        }
    }

    /**
     * 集合转换成List
     * @param collection
     * @param <T>
     */
    public static <T> List<T> toList(Collection<T> collection) {
        if (isNotEmpty(collection)) {
            return collection.stream().collect(Collectors.toList());
        }
        return new ArrayList<T>();
    }
}
