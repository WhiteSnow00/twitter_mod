// 
// Decompiled by Procyon v0.6.0
// 

public interface zvv<T>
{
    T a(final w3c p0, final wrm p1);
    
    public static final class a
    {
        public static <H, UH extends zvv<H>> H a(final UH uh, final w3c w3c, final wrm wrm) {
            if (uh == null) {
                return null;
            }
            return uh.a(w3c, wrm);
        }
    }
}
