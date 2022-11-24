import android.os.LocaleList;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lte extends Paint
{
    public lte() {
    }
    
    public lte(final int n) {
        super(n);
    }
    
    public lte(final int n, final PorterDuff$Mode porterDuff$Mode) {
        super(1);
        this.setXfermode((Xfermode)new PorterDuffXfermode(porterDuff$Mode));
    }
    
    public lte(final PorterDuff$Mode porterDuff$Mode) {
        this.setXfermode((Xfermode)new PorterDuffXfermode(porterDuff$Mode));
    }
    
    public final void setTextLocales(final LocaleList list) {
    }
}
