/*
 * Copyright (C) 2011 Michael M&uuml;hlebach <michael at anduin.ch>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package zbeans.cowgraph.model;

import java.awt.Color;
import zbeans.simple.beans.ObservableBean;

/**
 * A circle.
 *
 * @author Michael M&uuml;hlebach <michael at anduin.ch>
 */
public class Circle extends ObservableBean implements GraphElement {

    @Override
    public long getX() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public long getY() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Color getColor() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
