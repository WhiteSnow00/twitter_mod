// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.onboarding.ocf.settings;

import java.util.List;
import java.util.Map;

@a91
public abstract class AbstractSettingsViewModel
{
    public Map<String, fpp> a;
    public Map<String, fpp> b;
    public final uv1<List<ipp>> c;
    public final ynl<kni> d;
    
    public AbstractSettingsViewModel(final duo duo) {
        this.c = (uv1<List<ipp>>)new uv1();
        this.d = (ynl<kni>)new ynl();
        this.a = nuh.a(0);
        this.b = nuh.a(0);
        duo.b(this);
    }
    
    public final t5j<a> b() {
        return (t5j<a>)((t5j)this.c).map((rtb)zvt.U0);
    }
    
    public static final class a
    {
        public final List<ipp> a;
        
        public a(final List<ipp> a) {
            this.a = a;
        }
    }
}
