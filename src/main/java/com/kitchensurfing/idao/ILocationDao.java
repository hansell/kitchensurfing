package com.kitchensurfing.idao;

import java.util.List;

import com.kitchensurfing.po.Location;

/**
 * @time 2014 5-23
 * @author Hansel
 *
 */
public interface ILocationDao {
   Location getLocation(final int id);
   int getRowCount();
   Location getLocation(final String name);
   List<Location> getLocation();
}
