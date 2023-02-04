import sample.annotation.impl.FooApplicationProcessor;

import javax.annotation.processing.Processor;

module sample.annotation {
    exports sample.annotation;

    provides Processor with FooApplicationProcessor;

    requires java.compiler;
}