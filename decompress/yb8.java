import com.google.android.exoplayer2.decoder.DecoderException;

// 
// Decompiled by Procyon v0.6.0
// 

public interface yb8<I, O, E extends DecoderException>
{
    O b() throws E, DecoderException;
    
    void c(final I p0) throws E, DecoderException;
    
    I d() throws E, DecoderException;
    
    void flush();
    
    void release();
}
