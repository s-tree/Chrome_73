
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/power_monitor.mojom
//

package org.chromium.device.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface PowerMonitor extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends PowerMonitor, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<PowerMonitor, PowerMonitor.Proxy> MANAGER = PowerMonitor_Internal.MANAGER;


    void addClient(
PowerMonitorClient client);


}