package executor.model;

import java.util.List;

public class Scenario
{
    String name;
    String site;
    List<Step> steps;
    
    public Scenario()
    {
    
    }
    
    public Scenario(String name, String site, List<Step> steps)
    {
        this.name = name;
        this.site = site;
        this.steps = steps;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getSite()
    {
        return site;
    }
    
    public void setSite(String site)
    {
        this.site = site;
    }
    
    public List<Step> getSteps()
    {
        return steps;
    }
    
    public void setSteps(List<Step> steps)
    {
        this.steps = steps;
    }
    
    @Override
    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder();
        for (Step s : steps)
        {
            stringBuilder.append(s.toString());
        }
        
        return stringBuilder.toString();
    }
    
    @Override
    public int hashCode()
    {
        int result = name.hashCode() + site.hashCode() + steps.hashCode();
        result = 31 * result;
        return result;
    }
    
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Scenario)) return false;
        
        Scenario scenario = (Scenario) o;
        
        return this.name.equals(scenario.getName())
                && this.site.equals(scenario.getSite())
                && this.steps.equals(scenario.getSteps());
    }
}
