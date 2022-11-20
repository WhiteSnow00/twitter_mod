import android.webkit.JavascriptInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zjk
{
    public final mnl<tmi> a;
    public final mcq<tmi> b;
    
    public zjk(final mnl<tmi> a, final mcq<tmi> b) {
        this.a = a;
        this.b = b;
    }
    
    @JavascriptInterface
    public final void handleInstallClick() {
        this.a.accept((Object)tmi.a);
    }
    
    @JavascriptInterface
    public final void handleLoadingComplete() {
        this.b.b((Object)tmi.a);
    }
}
