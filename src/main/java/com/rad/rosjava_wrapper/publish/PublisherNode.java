package com.rad.rosjava_wrapper.publish;

import org.ros.node.NodeMain;

public interface PublisherNode extends NodeMain {
    public void publishMessage();
}
