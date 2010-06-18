/*
 * This file is part of the Linux Variability Modeling Tools (LVAT).
 *
 * Copyright (C) 2010 Steven She <shshe@gsd.uwaterloo.ca>
 *
 * LVAT is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * LVAT is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for
 * more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with LVAT.  (See files COPYING and COPYING.LESSER.)  If not, see
 * <http://www.gnu.org/licenses/>.
 */

package gsd.linux

case class FeatureModel(features: List[Feature], groups: List[XorGroup])

abstract class Feature(name: String,
                       constraints: List[BExpr],
                       children: List[Feature])
case class OFeature(n: String, ctcs: List[BExpr], cs: List[Feature])
        extends Feature(n, ctcs, cs)
case class MFeature(n: String, ctcs: List[BExpr], cs: List[Feature])
        extends Feature(n, ctcs, cs)

case class XorGroup(members: List[String])


