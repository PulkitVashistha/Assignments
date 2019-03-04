package com.ttnd.extra.Java2;

class NoStackTraceRuntimeException extends RuntimeException {
    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}

public class NoStackTrace {
    public static void main(String[] args) {
        try{
            throw new NoStackTraceRuntimeException();
        }catch(NoStackTraceRuntimeException e){
            e.printStackTrace();
        }
    }
}
