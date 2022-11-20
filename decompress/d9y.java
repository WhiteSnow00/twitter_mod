import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d9y
{
    public static final Map<Integer, String> a;
    public static final Map<Integer, String> b;
    
    static {
        final HashMap hashMap = d9y.a = new HashMap();
        final HashMap hashMap2 = d9y.b = new HashMap();
        final Integer value = -1;
        hashMap.put(value, "The requesting app is unavailable (e.g. unpublished, nonexistent version code).");
        final Integer value2 = -2;
        hashMap.put(value2, "The requested pack is not available.");
        final Integer value3 = -3;
        hashMap.put(value3, "The request is invalid.");
        final Integer value4 = -4;
        hashMap.put(value4, "The requested download is not found.");
        final Integer value5 = -5;
        hashMap.put(value5, "The Asset Delivery API is not available.");
        final Integer value6 = -6;
        hashMap.put(value6, "Network error. Unable to obtain the asset pack details.");
        final Integer value7 = -7;
        hashMap.put(value7, "Download not permitted under current device circumstances (e.g. in background).");
        final Integer value8 = -10;
        hashMap.put(value8, "Asset pack download failed due to insufficient storage.");
        final Integer value9 = -11;
        hashMap.put(value9, "The Play Store app is either not installed or not the official version.");
        final Integer value10 = -12;
        hashMap.put(value10, "Tried to show the cellular data confirmation but no asset packs are waiting for Wi-Fi.");
        final Integer value11 = -13;
        hashMap.put(value11, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.");
        final Integer value12 = -100;
        hashMap.put(value12, "Unknown error downloading an asset pack.");
        hashMap2.put(value, "APP_UNAVAILABLE");
        hashMap2.put(value2, "PACK_UNAVAILABLE");
        hashMap2.put(value3, "INVALID_REQUEST");
        hashMap2.put(value4, "DOWNLOAD_NOT_FOUND");
        hashMap2.put(value5, "API_NOT_AVAILABLE");
        hashMap2.put(value6, "NETWORK_ERROR");
        hashMap2.put(value7, "ACCESS_DENIED");
        hashMap2.put(value8, "INSUFFICIENT_STORAGE");
        hashMap2.put(value9, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(value10, "NETWORK_UNRESTRICTED");
        hashMap2.put(value11, "APP_NOT_OWNED");
        hashMap2.put(value12, "INTERNAL_ERROR");
    }
}
