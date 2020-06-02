module use {
    requires spring.boot.autoconfigure;
    requires spring.boot;
    exports com.module.use.internal;
    exports com.module.use.data;
    exports com.module.use.data.type;
}