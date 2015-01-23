/*
    This file is part of Soot JavaEE Stubs creator.

    Soot JavaEE Stubs creator is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Soot JavaEE Stubs creator is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with Soot JavaEE Stubs creator.  If not, see <http://www.gnu.org/licenses/>.

    Copyright 2014-2015 Ecole Polytechnique de Montreal & Tata Consultancy Services
 */
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
