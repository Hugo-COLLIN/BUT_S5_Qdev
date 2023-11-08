import java.util.List;

public class CalculPointDansFormes {
    public boolean isPointDansFormes(int x, int y, List<FormeGeometrique> formes) {
        for (var s : formes)
            if (s.isPointDansForme(x,y))
                return true;
        return false;
    }
}