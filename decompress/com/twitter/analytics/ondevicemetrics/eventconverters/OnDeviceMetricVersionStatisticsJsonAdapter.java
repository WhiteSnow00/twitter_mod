// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.analytics.ondevicemetrics.eventconverters;

import java.io.IOException;
import java.util.Objects;
import com.google.gson.TypeAdapter;

public class OnDeviceMetricVersionStatisticsJsonAdapter extends TypeAdapter<mhj>
{
    public final Object read(final fie fie) throws IOException {
        fie.b();
        double n3;
        double n2 = n3 = -1.0;
        int q0 = 0;
        while (fie.hasNext()) {
            final String n4 = fie.N0();
            Objects.requireNonNull(n4);
            int n5 = -1;
            switch (n4) {
                case "count": {
                    n5 = 2;
                    break;
                }
                case "mean": {
                    n5 = 1;
                    break;
                }
                case "variance": {
                    n5 = 0;
                    break;
                }
                default:
                    break;
            }
            switch (n5) {
                default: {
                    fie.h0();
                    continue;
                }
                case 2: {
                    q0 = fie.Q0();
                    continue;
                }
                case 1: {
                    n2 = fie.n2();
                    continue;
                }
                case 0: {
                    n3 = fie.n2();
                    continue;
                }
            }
        }
        fie.f();
        return new lyb(n2, n3, q0);
    }
    
    public final void write(final ple ple, final Object o) throws IOException {
        final mhj mhj = (mhj)o;
        if (mhj instanceof lyb) {
            final lyb lyb = (lyb)mhj;
            ple.c();
            ple.h("mean");
            ple.z(lyb.a);
            ple.h("variance");
            ple.z(lyb.b);
            ple.h("count");
            ple.K(lyb.c);
            ple.f();
        }
        else {
            cag.c("OnDeviceMetric", "Unexpected type of version statistics encountered.");
            ple.j();
        }
    }
}
