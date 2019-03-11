package org.bitsofinfo.hazelcast.discovery.docker.swarm.filter;

import com.spotify.docker.client.messages.swarm.Service;

public class NameBasedServiceFilter extends AbstractServiceFilter {
    private String serviceName;

    public NameBasedServiceFilter(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * @see ServiceFilter#accept(Service)
     */
    @Override
    public boolean accept(Service service) {
        return serviceName.equals(service.spec().name());
    }

    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "ServiceNameFilter: \"" + serviceName + "\".equals(service.spec().name())";
    }
}
