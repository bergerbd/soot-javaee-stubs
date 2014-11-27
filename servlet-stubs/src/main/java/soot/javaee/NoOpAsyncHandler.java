/*
 * (c) 2014 Tata Consultancy Services & Ecole Polytechnique de Montreal
 * All rights reserved
 */
package soot.javaee;

import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

public class NoOpAsyncHandler<T> implements AsyncHandler<T> {
    @Override
    public void handleResponse(Response<T> res) {
        //No-Op
    }
}
