// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.assetpacks;

import android.os.BaseBundle;
import android.os.Bundle;

public abstract class AssetPackState
{
    public static AssetPackState h(final String s, final int n, final int n2, final long n3, final long n4, final double n5, final int n6, final String s2, final String s3) {
        return (AssetPackState)new qky(s, n, n2, n3, n4, (int)Math.rint(100.0 * n5), n6, s2, s3);
    }
    
    public static AssetPackState i(final Bundle bundle, final String s, final cqy cqy, final jxy jxy, final fjy fjy) {
        final int o = fjy.o(((BaseBundle)bundle).getInt(pf8.w0("status", s)));
        final int int1 = ((BaseBundle)bundle).getInt(pf8.w0("error_code", s));
        final long long1 = ((BaseBundle)bundle).getLong(pf8.w0("bytes_downloaded", s));
        final long long2 = ((BaseBundle)bundle).getLong(pf8.w0("total_bytes_to_download", s));
        synchronized (cqy) {
            final Double n = cqy.a.get(s);
            double doubleValue;
            if (n == null) {
                doubleValue = 0.0;
                monitorexit(cqy);
            }
            else {
                doubleValue = n;
                monitorexit(cqy);
            }
            final long long3 = ((BaseBundle)bundle).getLong(pf8.w0("pack_version", s));
            final long long4 = ((BaseBundle)bundle).getLong(pf8.w0("pack_base_version", s));
            final int n2 = 4;
            int n3 = o;
            if (o == 4) {
                if (long4 != 0L && long4 != long3) {
                    final int n4 = 2;
                    n3 = n2;
                    final int n5 = n4;
                    return h(s, n3, int1, long1, long2, doubleValue, n5, ((BaseBundle)bundle).getString(pf8.w0("pack_version_tag", s), String.valueOf(((BaseBundle)bundle).getInt("app_version_code"))), jxy.a(s));
                }
                n3 = 4;
            }
            final int n5 = 1;
            return h(s, n3, int1, long1, long2, doubleValue, n5, ((BaseBundle)bundle).getString(pf8.w0("pack_version_tag", s), String.valueOf(((BaseBundle)bundle).getInt("app_version_code"))), jxy.a(s));
        }
    }
    
    public abstract long a();
    
    public abstract int b();
    
    public abstract String c();
    
    public abstract int d();
    
    public abstract long e();
    
    public abstract int f();
    
    public abstract int g();
    
    public abstract String j();
    
    public abstract String k();
}
