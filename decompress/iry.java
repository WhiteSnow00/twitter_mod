import java.io.IOException;
import com.google.firebase.encoders.EncodingException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iry implements unw
{
    public boolean a;
    public boolean b;
    public lxa c;
    public final yqy d;
    
    public iry(final yqy d) {
        this.a = false;
        this.b = false;
        this.d = d;
    }
    
    public final unw b(final String s) throws IOException {
        if (!this.a) {
            this.a = true;
            this.d.b(this.c, s, this.b);
            return (unw)this;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }
    
    public final unw c(final boolean b) throws IOException {
        if (!this.a) {
            this.a = true;
            this.d.c(this.c, b ? 1 : 0, this.b);
            return (unw)this;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }
}
