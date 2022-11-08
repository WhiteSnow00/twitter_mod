// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.analytics.tracking;

public final class d extends e$a
{
    public final /* synthetic */ String a;
    public final /* synthetic */ o40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ InstallationReferrer d;
    
    public d(final InstallationReferrer d, final String a, final o40 b, final String c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final int n, final String s, final String s2) {
        Label_0061: {
            if (n != -1 && n != 4) {
                if (n != 257) {
                    break Label_0061;
                }
            }
            try {
                saw.b((okm)new zf4(new String[] { "external", "", "gp", "__LicensingStatus", "failed" }));
                this.d.b(this.a, this.b, this.c, new r5c(String.valueOf(n), s, s2));
            }
            catch (final Exception ex) {
                e9a.c(new z8a((Throwable)ex));
            }
        }
    }
}
