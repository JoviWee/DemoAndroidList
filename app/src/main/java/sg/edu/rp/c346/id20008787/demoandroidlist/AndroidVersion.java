package sg.edu.rp.c346.id20008787.demoandroidlist;

import androidx.annotation.NonNull;

public class AndroidVersion {
    private String name;
    private String version;

    public AndroidVersion(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public String getName() {
        return name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NonNull
    @Override
    public String toString() {
        return name + " - " + version ;
    }
}
