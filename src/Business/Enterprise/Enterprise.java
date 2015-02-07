/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.FinanceAccount.FinanceAccountDirectory;
import Business.Logger.Logging;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.WorkRequest.WorkQueue;

/**
 *
 * @author Abhinav
 */
public abstract class Enterprise extends Organization
{
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private WorkQueue workQueue;
    private FinanceAccountDirectory financeAccountDirectory;

    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
        workQueue = new WorkQueue();
        financeAccountDirectory = new FinanceAccountDirectory();
    }
    
    public enum EnterpriseType
    {
        Advertiser("Advertiser"),
        Publisher("Publisher"),
        Consumer("Consumer"),
        MarketingAgency("MarketingAgency");
        
        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public FinanceAccountDirectory getFinanceAccountDirectory() {
        return financeAccountDirectory;
    }
    
}
