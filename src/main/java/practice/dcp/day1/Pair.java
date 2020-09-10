/**
 *  Copyright Sandvine Inc. 2020.  All rights reserved.
 */
package practice.dcp.day1;

/**
 * A class for returning a pair of values where neither is really a key or value. If that is the case, use Map.Entry.
 * 
 * @param <A>
 * @param <B>
 */
public class Pair<A, B>
{
    private A m_first;

    private B m_second;

    public Pair(A first, B second)
    {
        m_first = first;
        m_second = second;
    }

   

    public A getFirst()
    {
        return m_first;
    }

    public B getSecond()
    {
        return m_second;
    }

   

    public void setFirst(A first)
    {
        m_first = first;
    }

    public void setSecond(B second)
    {
        m_second = second;
    }



    /* (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Pair [m_first=" + m_first + ", m_second=" + m_second + "]";
    }



    /* (non-Javadoc)
     *
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((m_first == null) ? 0 : m_first.hashCode());
        result = prime * result + ((m_second == null) ? 0 : m_second.hashCode());
        return result;
    }



    /* (non-Javadoc)
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pair other = (Pair) obj;
        if (m_first == null)
        {
            if (other.m_first != null)
                return false;
        }
        else if (!m_first.equals(other.m_first))
            return false;
        if (m_second == null)
        {
            if (other.m_second != null)
                return false;
        }
        else if (!m_second.equals(other.m_second))
            return false;
        return true;
    }

    
}