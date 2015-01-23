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

import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

public class NoOpAsyncHandler<T> implements AsyncHandler<T> {
    @Override
    public void handleResponse(Response<T> res) {
        //No-Op
    }
}
