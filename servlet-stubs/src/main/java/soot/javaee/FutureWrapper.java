package soot.javaee;

import javax.xml.ws.Response;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureWrapper<T> implements Future<T>, Response<T> {

    final T wrapped;

    public FutureWrapper(T obj) {
        wrapped = obj;
    }

    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        return false;
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public boolean isDone() {
        return true;
    }

    @Override
    public T get() throws InterruptedException, ExecutionException {
        return wrapped;
    }

    @Override
    public T get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return wrapped;
    }

    @Override
    public Map<String, Object> getContext() {
        return Collections.emptyMap();
    }
}
