
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/appcache/appcache.mojom
//

package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public final class AppCacheResourceInfo extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public org.chromium.url.mojom.Url url;
    public long size;
    public boolean isMaster;
    public boolean isManifest;
    public boolean isIntercept;
    public boolean isFallback;
    public boolean isForeign;
    public boolean isExplicit;
    public long responseId;

    private AppCacheResourceInfo(int version) {
        super(STRUCT_SIZE, version);
    }

    public AppCacheResourceInfo() {
        this(0);
    }

    public static AppCacheResourceInfo deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static AppCacheResourceInfo deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static AppCacheResourceInfo decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        AppCacheResourceInfo result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new AppCacheResourceInfo(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.url = org.chromium.url.mojom.Url.decode(decoder1);
                }
                {
                    
                result.size = decoder0.readLong(16);
                }
                {
                    
                result.isMaster = decoder0.readBoolean(24, 0);
                }
                {
                    
                result.isManifest = decoder0.readBoolean(24, 1);
                }
                {
                    
                result.isIntercept = decoder0.readBoolean(24, 2);
                }
                {
                    
                result.isFallback = decoder0.readBoolean(24, 3);
                }
                {
                    
                result.isForeign = decoder0.readBoolean(24, 4);
                }
                {
                    
                result.isExplicit = decoder0.readBoolean(24, 5);
                }
                {
                    
                result.responseId = decoder0.readLong(32);
                }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.url, 8, false);
        
        encoder0.encode(this.size, 16);
        
        encoder0.encode(this.isMaster, 24, 0);
        
        encoder0.encode(this.isManifest, 24, 1);
        
        encoder0.encode(this.isIntercept, 24, 2);
        
        encoder0.encode(this.isFallback, 24, 3);
        
        encoder0.encode(this.isForeign, 24, 4);
        
        encoder0.encode(this.isExplicit, 24, 5);
        
        encoder0.encode(this.responseId, 32);
    }
}