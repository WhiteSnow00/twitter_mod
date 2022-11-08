import android.net.Uri;
import android.content.ContentResolver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v83 extends uuy
{
    public final int d;
    
    public v83(final ContentResolver contentResolver, final Uri uri, final s97<nws> s97, final int d) {
        super(contentResolver, uri, s97);
        this.d = d;
    }
    
    @Override
    public final i4e<nws> a(final uts uts, final int n) {
        return (i4e<nws>)new bld(uts, (s97)super.a, this.d, n);
    }
}
