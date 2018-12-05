package netcracker.nchostel.service;

import netcracker.nchostel.dao.HostelDAO;
import netcracker.nchostel.domain.Hostel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HostelServiceImpl implements HostelService {

    @Autowired
    private HostelDAO hostelDAO;

    @Transactional
    public void addHostel(Hostel hostel) {
        hostelDAO.addHostel(hostel);
    }

    @Transactional
    public List<Hostel> listHostel() {
        return hostelDAO.listHostel();
    }

    @Transactional
    public void removeHostel(Integer id) {
        hostelDAO.removeHostel(id);
    }

    @Transactional
    public void updateHostel(Hostel hostel) {
        hostelDAO.updateHostel(hostel);
    }
}