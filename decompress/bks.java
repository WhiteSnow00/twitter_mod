import java.util.Arrays;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import androidx.annotation.RecentlyNonNull;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bks implements cks
{
    @RecentlyNonNull
    public static final bks c;
    public final AtomicReference<Boolean> a;
    public final Executor b;
    
    static {
        c = new bks();
    }
    
    public bks() {
        this.a = new AtomicReference<Boolean>();
        this.b = null;
    }
    
    @RecentlyNonNull
    @Override
    public final String a() {
        if (!this.b()) {
            return "play-services-mlkit-text-recognition";
        }
        return "text-recognition";
    }
    
    @Override
    public final boolean b() {
        if (this.a.get() != null) {
            return this.a.get();
        }
        final boolean b = DynamiteModule.a(rch.c().b(), "com.google.mlkit.dynamite.text.latin") > 0;
        this.a.set(b);
        return b;
    }
    
    @Override
    public final int c() {
        if (this.b()) {
            return 24317;
        }
        return 24306;
    }
    
    @RecentlyNonNull
    @Override
    public final String d() {
        if (!this.b()) {
            return "com.google.android.gms.vision.ocr";
        }
        return "com.google.mlkit.dynamite.text.latin";
    }
    
    @Override
    public final void e() {
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof bks && r5j.a(this.b, ((bks)o).b));
    }
    
    @RecentlyNonNull
    @Override
    public final String f() {
        if (!this.b()) {
            return "com.google.android.gms.vision.text.mlkit.TextRecognizerCreator";
        }
        return "com.google.mlkit.vision.text.bundled.latin.BundledLatinTextRecognizerCreator";
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.b });
    }
}
