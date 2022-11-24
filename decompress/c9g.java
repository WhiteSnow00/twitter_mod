import java.io.IOException;
import android.util.JsonToken;
import android.util.JsonReader;
import java.io.Reader;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class c9g
{
    public static c9g a(Reader reader) throws IOException {
        reader = (Reader)new JsonReader(reader);
        try {
            ((JsonReader)reader).beginObject();
            while (((JsonReader)reader).hasNext()) {
                if (((JsonReader)reader).nextName().equals("nextRequestWaitMillis")) {
                    if (((JsonReader)reader).peek() == JsonToken.STRING) {
                        return new ob1(Long.parseLong(((JsonReader)reader).nextString()));
                    }
                    return new ob1(((JsonReader)reader).nextLong());
                }
                else {
                    ((JsonReader)reader).skipValue();
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        }
        finally {
            ((JsonReader)reader).close();
        }
    }
    
    public abstract long b();
}
