package org.example.eureka.customer.tools;

/**
 * Simple Message Wrapper
 */
public class MessageWrapper<T> {
    /**
     * The original message.
     */
    private T wrapped;

    /**
     * The additional message
     */
    private String message;

    /**
     * A Default Constructor
     * @param wrapped - original message
     * @param message - additional message
     */
    public MessageWrapper(T wrapped, String message) {
        this.wrapped = wrapped;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public T getWrapped() {
        return wrapped;
    }

}