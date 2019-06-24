package dae.example.template.beans;

import dae.example.template.entities.Expansion;
import dae.example.template.services.ExpansionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import javax.inject.Named;
import java.util.List;

@Named
@Scope("request")
public class ExpansionBean {
    @Autowired
    private ExpansionService expansionService;

    private List<Expansion> expansions = null;

    public List<Expansion> getExpansions() {
        if (expansions == null) {
            expansions = expansionService.findAll();
        }
        return expansions;
    }

    public void setExpansions(List<Expansion> expansions) {
        this.expansions = expansions;
    }
}