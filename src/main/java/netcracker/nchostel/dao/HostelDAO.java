package netcracker.nchostel.dao;

import netcracker.nchostel.domain.Hostel;

import java.util.List;

public interface HostelDAO {
    public void addHostel(Hostel hostel);

    public List<Hostel> listHostel();

    public void removeHostel(Integer id);

    public void updateHostel(Hostel hostel);
}
