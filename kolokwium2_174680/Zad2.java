public class Zad2
{
    public abstract class WorkTool
    {
        private String name;
        private int productionYear;

        public WorkTool(String name, int productionYear)
        {
            this.name = name;
            this.productionYear = productionYear;
        }

        public abstract void use();

    }
    public abstract class Hammer extends WorkTool
    {
        public Hammer(String name, int productionYear)
        {
            super(name, productionYear);
        }

        public abstract void use();
    }
    public abstract class Screwdriver extends WorkTool
    {
        public Screwdriver(String name, int productionYear)
        {
            super(name, productionYear);
        }

        public abstract void use();
    }
    public abstract class Saw extends WorkTool
    {
        public Saw(String name, int productionYear)
        {
            super(name, productionYear);
        }

        public abstract void use();
    }
}
